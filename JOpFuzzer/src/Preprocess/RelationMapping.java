package Preprocess;

import Options.*;
import com.opencsv.CSVWriter;
import javaslang.Tuple3;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static Utils.Execute.execute;

public class RelationMapping {
    double[][] StructureOptionRelation = new double[SourceCodeFeature.values().length][Option.values().length];
    int[][] StructureOptionRelationTime = new int[SourceCodeFeature.values().length][Option.values().length];

    public void mapping(List<Encode> encodes, Config config) throws IOException {
        String jdkPath = config.getJdkPath();
        String seedPath = config.getSeedPath();
        String seedName = config.getSeedName();
        String javac = jdkPath + "/bin/javac " + seedPath + seedName;
        int javacExitValue = execute(javac);
        if (javacExitValue != 0) {
            System.err.println(config.getSeedPath() + config.getSeedName() + " compiles error!");
            return;
        } else System.out.println(config.getSeedPath() + config.getSeedName() + " compiles success!");
        String classPath = "";
        String packageName = config.getPackageName();
        seedName = seedName.replace(".java", "");
        if (packageName == null) {
            classPath = " -cp " + seedPath;
        } else {
            seedName = packageName + "." + seedName;
        }
        String cmd = "timeout 30s " + jdkPath + "/bin/java" + classPath + " " + seedName + " > " + seedPath + "result";
        int resultValue = execute(cmd);
        if (resultValue != 0) {
            System.err.println(config.getSeedPath() + config.getSeedName() + " runs error!");
            System.err.println(cmd);
            return;
        } else System.out.println(config.getSeedPath() + config.getSeedName() + " runs success!");
        for (Encode enc : encodes) {
            String methodName = enc.getMethodName();
            //排除这个方法
            String excludeMethod = "-XX:CompileCommand=exclude," + seedName.replaceAll("\\.", "/") + "." + methodName;
            int optionIndex = 0;
            //管理线程池
            ExecutorService es = Executors.newFixedThreadPool(Option.values().length);
            for (ProfileData p : ProfileData.values()) {
                String profile = "-XX:+" + p.toString();
                //每个p代表一组选项；例如PrintInlining中的所有选项
                for (Tuple3<String, List<Integer>, Boolean> tuple : p.getOptionAndValue()) {
                    //制作选项开启列表，每个option只开启一个选项
                    String option = makeOption(tuple, p);
                    //包含这个方法进行执行
                    String methodOn = "timeout 30s " + jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + classPath + " " + profile + option + " " + seedName + " > " + seedPath + tuple._1 + "_" + methodName + "_on";
                    //排除这个方法进行执行
                    String methodOff = "timeout 30s " + jdkPath + "/bin/java -Xbatch -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockDiagnosticVMOptions -XX:+UnlockExperimentalVMOptions " + classPath + " " + profile + option + " " + excludeMethod + " " + seedName + " > " + seedPath + tuple._1 + "_" + methodName + "_off";
                    //执行Task的run方法
                    es.execute(new Task(tuple, enc, methodOn, methodOff, optionIndex, StructureOptionRelation, StructureOptionRelationTime, seedPath));
                    optionIndex++;
                }
            }
            es.shutdown();
            while (!es.isTerminated()) {
                //wait
            }
        }

    }

    //制作选项开启列表，每个option只开启一个选项
    private String makeOption(Tuple3<String, List<Integer>, Boolean> tuple, ProfileData p) {
        String option = " ";
        //p代表一组选项
        //tuple2._1 的值为优化选项例如"AlwaysIncrementalInline"
        for (Tuple3<String, List<Integer>, Boolean> tuple2 : p.getOptionAndValue()) {
            if (tuple._1.equals(tuple2._1)) { //open the selected option
                //选项如果是布尔类型直接使用
                if (tuple2._3) option += "-XX:+" + tuple2._1 + " ";
                //如果不是布尔类型取边界值进行赋值
                else option += "-XX:" + tuple2._1 + "=" + tuple2._2.get(1) + " ";
            } else {
                //关闭选项
                if (tuple2._3) option += "-XX:-" + tuple2._1 + " ";
                else option += "-XX:" + tuple2._1 + "=" + tuple2._2.get(0) + " ";
            }
        }
        return option;
    }


    public void saveArray() throws IOException {
        File result = new File("./result.csv");
        FileWriter outputFile = new FileWriter(result);
        CSVWriter writer = new CSVWriter(outputFile);
        for (int i = 0; i < SourceCodeFeature.values().length; i++) {
            String[] value = Arrays.stream(StructureOptionRelation[i]).mapToObj(String::valueOf).toArray(String[]::new);
            writer.writeNext(value);
        }
        writer.close();
    }

    public void calculateFinalRelationship() {
        for (int i = 0; i < SourceCodeFeature.values().length; i++) {
            for (int j = 0; j < Option.values().length; j++) {
                StructureOptionRelation[i][j] = StructureOptionRelation[i][j] / StructureOptionRelationTime[i][j];
            }
        }
    }

    public double[][] getStructureOptionRelation() {
        return StructureOptionRelation;
    }


}

