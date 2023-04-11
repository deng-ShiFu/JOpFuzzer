package Mutation.DT;

import Options.Option;
import Preprocess.ProfileData;
import Preprocess.SourceCodeFeature;
import com.github.difflib.DiffUtils;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Patch;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import javaslang.Tuple3;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static Utils.Execute.execute;

public class DifferentialTest {
    float[][] StructureOptionRelation = new float[SourceCodeFeature.values().length][Option.values().length];
    String jdkPath;
    Boolean isRunnable = true;
    Boolean isSafe = true;
    Boolean isWorthToSave = true;
    Boolean random = false;
    List<String> options = new ArrayList<>();
    List<String> newOption = new ArrayList<>();
    HashMap<String, String> optionProfiles = new HashMap<>();
    File test;
    String bugCmd;
    float threshold;// threshold for the relation between structure and option
    int selectOptionNumber = 3;// number of options to be selected

    public DifferentialTest(String jdkPath, File test, List<String> originOptions, List<String> changedStructure) throws IOException, ExecutionException, InterruptedException {
        this.jdkPath = jdkPath;
        this.test = test;
        readArray();
        String cmdResult = "timeout 30s " + jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -cp " + test.getAbsolutePath() + " Test " + " > " + test.getCanonicalPath() + "/result.log";
        int exitValueResult = execute(cmdResult);
        if (exitValueResult != 0) {
            System.err.println("Result Error:" + test.getCanonicalPath() + " failed");
            isRunnable = false;
        } else {
            if (random) {
                randomSelectOption();
                executeOption(new ArrayList<>());
            } else {
                //分析突变的结构，选择合适的优化选项
                options = analyzeChangedStructure(changedStructure);
                if (options == null)
                    return;
                executeOption(originOptions);
                if (isSafe)
                    executeProfile();
            }
        }
    }

    private void randomSelectOption() {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int index = r.nextInt(Option.values().length);
            options.add(String.valueOf(Option.values()[index]));
        }
    }

    public void executeProfile() throws IOException {
        getProfile();
        String option;
        String profile;
        String cmd;
        HashMap<String, Double> optionSimilarity = new HashMap<>();
        for (Map.Entry<String, String> p : optionProfiles.entrySet()) {
            profile = " -XX:+" + p.getValue() + " ";
            option = getOptionNon_defaultValue(p.getKey());
            //cmd = jdkPath + "/bin/java -cp -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + test.getCanonicalPath() + " " + profile + " Test " + " > " + test.getCanonicalPath() + "/default.log";
            //String cmdProfile = jdkPath + "/bin/java -cp -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + test.getCanonicalPath() + " " + profile + " " + option + " Test " + " > " + test.getCanonicalPath() + "/profile.log";
            cmd = jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " +" " + profile + " -cp " + test.getCanonicalPath() + " Test " + " > " + test.getCanonicalPath() + "/default.log";
            String cmdProfile = jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + " " + profile + " " + option + " -cp " + test.getCanonicalPath() + " Test " + " > " + test.getCanonicalPath() + "/profile.log";
            System.out.println("cmd: "+cmd);
            System.out.println("cmdProfile: "+cmdProfile);
            int exitValue = execute(cmd);
            int exitValueProfile = execute(cmdProfile);
            if (exitValue != 0 || exitValueProfile != 0) {
                System.err.println("Profile Error:" + test.getCanonicalPath() + " failed");
                Files.writeString(Path.of(test.getCanonicalPath() + "/bugCmd.log"), cmd);
                isSafe = false;
                return;
            }
            //计算两种运行结果的相似性
            double similarity = calculateProfileSimilarity();
            optionSimilarity.put(p.getKey(), similarity);
        }
        List<Map.Entry<String, Double>> optionSimilarityList = new ArrayList<>(optionSimilarity.entrySet());
        //递减排序
        optionSimilarityList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        //if (Double.parseDouble(optionSimilarityList.get(0).getKey()) > threshold && Double.parseDouble(optionSimilarityList.get(1).getKey()) > threshold && Double.parseDouble(optionSimilarityList.get(2).getKey()) > threshold) {
        if (optionSimilarityList.get(0).getValue() > threshold && optionSimilarityList.get(1).getValue() > threshold && optionSimilarityList.get(2).getValue() > threshold) {
            isWorthToSave = false;
            return;
        }
        for (int i = 0; i < selectOptionNumber; i++) {
            newOption.add(optionSimilarityList.get(i).getKey());
            System.out.println(optionSimilarityList.get(i).getKey());
        }
    }

    private double calculateProfileSimilarity() throws IOException {
        double similarity;
        File result = new File(test.getCanonicalPath() + "/result.log");
        File defaultFile = new File(test.getCanonicalPath() + "/default.log");
        File profileFile = new File(test.getCanonicalPath() + "/profile.log");
        List<String> resultList = Files.readAllLines(result.toPath());
        List<String> defaultLines = Files.readAllLines(defaultFile.toPath());
        List<String> profileLines = Files.readAllLines(profileFile.toPath());
        defaultLines.removeAll(resultList);
        profileLines.removeAll(resultList);
        Patch<String> diff = DiffUtils.diff(defaultLines, profileLines);
        double delta = 0;
        for (AbstractDelta<String> p : diff.getDeltas()) {
            delta += p.getTarget().size() + p.getSource().size();
        }
        if (defaultLines.size() + profileLines.size() == 0)
            return 1;
        similarity = delta / defaultLines.size() + profileLines.size();
        Files.delete(defaultFile.toPath());
        Files.delete(profileFile.toPath());
        return similarity;
    }

    private String getOptionNon_defaultValue(String option) {
        int[] result = Option.valueOf(option).getRange();
        if (result[2] == 1) {
            if (result[0] == 1)
                return "-XX:-" + option;
            else
                return "-XX:+" + option;
        } else {
            if (result[0] == result[1])
                return "-XX:" + option + "=" + result[2];
            else
                return "-XX:" + option + "=" + result[1];
        }


    }

    private void getProfile() {
        for (String op : options) {
            for (ProfileData profileData : ProfileData.values()) {
                List<Tuple3<String, List<Integer>, Boolean>> result = profileData.getOptionAndValue();
                for (Tuple3<String, List<Integer>, Boolean> tuple : result) {
                    if (tuple._1.equals(op)) {
                        optionProfiles.put(op, profileData.toString());
                        break;
                    }
                }
            }
        }
    }


    private void executeOption(List<String> originOptions) throws IOException, ExecutionException, InterruptedException {
        Set<String> optionSet = new HashSet<>();
        optionSet.addAll(originOptions);
        optionSet.addAll(options);
        optionSet.remove("");
        String cmd;
        int testNumber = (int) Math.pow(2, optionSet.size());
        ExecutorService threadPool = Executors.newFixedThreadPool(testNumber);
        //根据选择的选项，每次只开启一个选项
        for (int i = 0; i < testNumber; i++) {
            //cmd = "timeout 30s " + jdkPath + "/bin/java -cp -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + test.getCanonicalPath() + " " + solveStringSet(optionSet, i) + " Test > " + test.getCanonicalPath() + "/" + i + ".log";
            cmd = "timeout 30s " + jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + solveStringSet(optionSet, i) + " -cp " + test.getCanonicalPath() + " "  + " Test > " + test.getCanonicalPath() + "/" + i + ".log";
            Future<Integer> result = threadPool.submit(new Task(cmd));
            if (result.get() != 0) {
                System.err.println("Option Error:" + cmd + " failed");
                Files.writeString(Path.of(test.getCanonicalPath() + "/bugCmd.log"), cmd);
                isSafe = false;
            }
        }
        threadPool.shutdown();
        while (!threadPool.isTerminated()) {
            //wait
        }
        if (!isSafe)
            return;
        //将本次生成的log文件与未启用选项时生成的result文件进行比较
        compareResult(testNumber);
        options = new ArrayList<>(optionSet);
    }

    private void compareResult(int size) throws IOException {
        File result = new File(test.getCanonicalPath() + "/result.log");
        for (int i = 0; i < size; i++) {
            File file = new File(test.getCanonicalPath() + "/" + i + ".log");
            if (file.exists()) {
                if (!FileUtils.contentEquals(result, file)) {
                    isSafe = false;
                    return;
                }
            }
            Files.delete(file.toPath());
        }
    }

    private String solveStringSet(Set<String> optionSet, int i) {
        List<String> optionList = new ArrayList<>(optionSet);
        int length = optionSet.size();
        String cmd = "";
        for (int j = 0; j < length; j++) {
            cmd += makeOption(optionList.get(j), i % 2);
            i /= 2;
        }
        return cmd;
    }

    private String makeOption(String option, int i) {
        if (option.equals("")) {
            return "";
        }
        int[] result = Option.valueOf(option).getRange();
        if (result[2] != 1) {
            if (i == 1) return " -XX:" + option + "=" + result[2] + " ";
            else return " -XX:" + option + "=" + result[1] + " ";
        } else {
            if (i == 1) return " -XX:+" + option + " ";
            else return " -XX:-" + option + " ";
        }
    }


    private List<String> analyzeChangedStructure(List<String> changedStructure) {
        if (changedStructure.size() == 0)
            return null;
        List<String> options = new ArrayList<>();
        float[] optionRelation = new float[Option.values().length];
        HashMap<Integer, Float> finalOptionRelation = new HashMap<>();
        //structure 如“ifStmt”
        for (String structure : changedStructure) {
            //获取给定枚举常量的序号
            int index = SourceCodeFeature.valueOf(structure).ordinal();
            for (int i = 0; i < Option.values().length; i++) {
                optionRelation[i] += StructureOptionRelation[index][i];
            }
        }
        float sum = 0;
        for (int i = 0; i < Option.values().length; i++) {
            if (!Float.isNaN(optionRelation[i]))
                sum += optionRelation[i];
        }
        System.out.println("sum: "+sum);
        //这里取出了selectOptionNumber个选项 与原文描述不一样
        //从头开始进行减，只能说 optionRelation 值越大在减法之后更可能会被出现r<=0，更会被选择。而不是随即选择selectOptionNumber个选项开启
        Random random = new Random();
        String s = "";
        //无法保证强制选择selectOptionNumber个选项，因为可能会选择相同的选项
        Set set = new HashSet();
        while(!(set.size()==selectOptionNumber)){
            float r = random.nextFloat() * sum;
            //System.out.println("r: "+r+" Option.values().length: "+Option.values().length+" sum: "+sum);
            for (int j = 0; j < Option.values().length; j++) {
                if(!Float.isNaN(optionRelation[j])){ //原代码 某一个optionRelation[j]为NaN，导致r变成NaN
                    r -= optionRelation[j];
                }
                if (r <= 0) {
                    if(!set.contains(Option.values()[j].toString())){
                        set.add(Option.values()[j].toString());
                        options.add(Option.values()[j].toString());

                        s+=Option.values()[j].toString()+" ";
                    }
                    break;
                }
            }
        }
        /*
        for (int i = 0; i < selectOptionNumber; i++) {
            float r = random.nextFloat() * sum;
            for (int j = 0; j < Option.values().length; j++) {
                if(!Float.isNaN(optionRelation[j])){ //原代码 某一个optionRelation[j]为NaN，导致r变成NaN
                    r -= optionRelation[j];
                }
                if (r <= 0) {
                    options.add(Option.values()[j].toString());
                    s+=Option.values()[j].toString()+" ";
                    break;
                }
            }
        }

         */
        System.out.println("选择的优化选项为: "+s);
        return options;
    }

    private void readArray() {
        try {
            Reader reader = new InputStreamReader(new FileInputStream("result.csv"));
            CSVReader csvReader = new CSVReader(reader);
            String[] nextLine;
            int index = 0;
            while ((nextLine = csvReader.readNext()) != null) {
                for (int i = 0; i < nextLine.length; i++) {
                    StructureOptionRelation[index][i] = Float.parseFloat(nextLine[i]);
                    threshold += StructureOptionRelation[index][i];
                }
                index++;
                threshold = threshold / (index * nextLine.length);
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Boolean getRunnable() {
        return isRunnable;
    }

    public Boolean getSafe() {
        return isSafe;
    }

    public String getBugCmd() {
        return bugCmd;
    }

    public Boolean getWorthToSave() {
        return isWorthToSave;
    }
}