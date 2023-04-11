package Mutation;

import Mutation.DT.DifferentialTest;
import Preprocess.Encode;
import Preprocess.SourceCodeFeature;
import org.apache.commons.io.FileUtils;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.LineFilter;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;

import static Utils.Execute.execute;

public class MutationEntry {
    String separator = System.getProperty("file.separator");

    public MutationEntry(String jdkPath, SeedPool seedPool, String mr) throws IOException, ExecutionException, InterruptedException {
        int mutationRound = Integer.parseInt(mr);//the mutation time
        String projectPath = "./JavaFuzzer/tests/"; // source code root path. e.g. /home/kui/Desktop/buggyProject
        int lineNumber; // line number of target file to be mutated. e.g. 10
        //获取生成的种子的路径
        List<File> seeds = new ArrayList<>(seedPool.seedPoolOptionPair.keySet());
        Random rand = new Random();
        int seedIndex;
        int format = String.valueOf(seeds.size()).length();
        while (mutationRound-- > 0) {
            seedIndex = rand.nextInt(seeds.size());
            //随即获取一个种子
            File dir = seeds.get(seedIndex);
            //要变异的文件行号
            lineNumber = analyzeFile(dir);
            //生成的种子数量
            int testNumber = seedPool.getTestNumber();
            //指定要变异的Java类的起始索引
            String sIndex = String.format("%0" + format + "d", seedIndex);
            //指定要变异的Java类的终止索引
            String tIndex = String.format("%0" + format + "d", testNumber + 1);
            String mutate = jdkPath + "/bin/java -jar JavaMutator.jar " + projectPath + " " + sIndex + " " + tIndex + " " + lineNumber + " " + jdkPath;
            System.out.println("开始变异");
            while (true) {
                //使用JavaMutator工具修改java源代码
                dir = seeds.get(seedIndex);
                lineNumber = analyzeFile(dir);
                mutate = jdkPath + "/bin/java -jar JavaMutator.jar " + projectPath + " " + sIndex + " " + tIndex + " " + lineNumber + " " + jdkPath;
                System.out.println(mutate);
                int exitValue = execute(mutate);
                System.out.println(exitValue);
                if (exitValue == 0) {
                    System.out.println("Mutation success!");
                    break;
                }
            }
            String originPath = projectPath + sIndex;
            String targetPath = projectPath + tIndex;
            System.out.println("originPath: "+originPath);
            System.out.println("targetPath: "+targetPath);
            //获取被修改的代码的结构信息
            List<String> changedStructure = new ArrayList<>(new HashSet<>(getChangedStructure(originPath, targetPath)));
            File mutatedFile = new File(targetPath);
            //分析突变的结构，选择合适的优化选项
            DifferentialTest differentialTest = new DifferentialTest(jdkPath, mutatedFile, seedPool.seedPoolOptionPair.get(dir), changedStructure);
            //运行失败
            if (!differentialTest.getRunnable()) {
                FileUtils.deleteDirectory(mutatedFile);
                continue;
            }
            //单个选项相关性超过矩阵和，数据不正确
            if (!differentialTest.getWorthToSave()) {
                FileUtils.deleteDirectory(mutatedFile);
                continue;
            }
            //选项开启后结果不一致、测试时运行失败
            if (!differentialTest.getSafe()) {
                //Files.createDirectories(Paths.get("Bug"));
                FileUtils.moveDirectory(dir, new File("Bug" + separator));
            }
            seedPool.addTestNumber();
        }
    }

    private List<String> getChangedStructure(String originPath, String targetPath) {
        List<String> changedStructure = new ArrayList<>();
        int start, end;
        try {
            List<String> lines = Files.readAllLines(Path.of(targetPath + "/patchLine.log"));
            String line = lines.get(0);
            start = Integer.parseInt(line.trim().split(" ")[0]);
            end = Integer.parseInt(line.trim().split(" ")[1]);
        } catch (IOException e) {
            return changedStructure;
        }
        Launcher launcher = new Launcher();
        launcher.addInputResource(originPath + "/Test.java");
        launcher.buildModel();
        CtModel model = launcher.getModel();
        List<CtStatement> statements = model.getElements(new LineFilter());
        for (CtStatement statement : statements) {
            SourcePosition position = statement.getPosition();
            if (position.isValidPosition()) {
                if (start >= position.getLine() && position.getEndLine() >= end) {
                    //对该行代码进行分析，如果包含某个代码特征，则在code数组中，将该代码特征对应的序号设置为1
                    Encode encode = new Encode(statement);
                    //遍历code数组将值为1的序号取出，该序号对应的代码特征取出放在changedStructure 如“ifStmt”
                    for (Integer i : encode.getStructureIndex()) {
                        changedStructure.add(SourceCodeFeature.values()[i].toString());
                    }
                }
            }
        }
        return changedStructure;
    }

    private int analyzeFile(File dir) throws IOException {
        int statementIndex = 0;
        Launcher launcher = new Launcher();
        launcher.addInputResource(dir.getCanonicalPath() + separator + "Test.java");
        launcher.buildModel();
        CtModel model = launcher.getModel();
        List<CtStatement> lines = model.getElements(new LineFilter());
        List<Integer> statementValues = new ArrayList<>();
        //分析种子中每一行的特征值
        for (CtStatement ctStatement : lines) {
            statementValues.add(analyzeStatement(ctStatement));
        }
        //将statementValues中所有值转换成整型并计算所有的和
        int sum = statementValues.stream().mapToInt(Integer::intValue).sum();
        Random rand = new Random();
        int randomValue = rand.nextInt(sum);
        for (int i = 0; i < statementValues.size(); i++) {
            randomValue -= statementValues.get(i);
            if (randomValue <= 0) {
                statementIndex = i;
                break;
            }
        }
        //获取代码所在行号
        System.out.println("获取行号");
        System.out.println(dir.getAbsoluteFile());
        System.out.println(lines.get(statementIndex));
        System.out.println(lines.get(statementIndex).getPosition());
        return lines.get(statementIndex).getPosition().getLine();
    }

    private int analyzeStatement(CtStatement statement) {
        int value = 0;
        int inLoop = 0;
        //语句是一个循环
        if (statement instanceof CtFor) {
            inLoop = 1; // since statement is a loop.
            CtFor ctFor = (CtFor) statement;
            //含有字段访问
            if (ctFor.getExpression().getElements(new TypeFilter<>(CtFieldAccess.class)).size() > 0) {
                value += 1;
            }
            //含有二元操作符表达所，例如“+” “-”
            if (ctFor.getExpression().getElements(new TypeFilter<>(CtBinaryOperator.class)).size() > 0) {
                value += 1;
            }
            //ctFor.getForInit获取循环初始化语句
            /*
            for (int i = 0; i < n; i++) {
                // 循环体
            }
            int i=0
             */
            for (CtStatement ctStatement : ctFor.getForInit()) {
                value += analyzeStatement(ctStatement);
            }
            //ctFor.getForUpdate获取循环迭代更新语句
            /*
            for (int i = 0; i < n; i++) {
                // 循环体
            }
            i++
             */
            for (CtStatement ctStatement : ctFor.getForUpdate()) {
                value += analyzeStatement(ctStatement);
            }
        } else if (statement instanceof CtWhile) {
            inLoop = 1;
            CtWhile ctWhile = (CtWhile) statement;
            if (ctWhile.getLoopingExpression().getElements(new TypeFilter<>(CtFieldAccess.class)).size() > 0) {
                value += 1;
            }
            if (ctWhile.getLoopingExpression().getElements(new TypeFilter<>(CtBinaryOperator.class)).size() > 0) {
                value += 1;
            }
        } else if (statement instanceof CtIf) {
            CtIf ctIf = (CtIf) statement;
            if (ctIf.getCondition().getElements(new TypeFilter<>(CtFieldAccess.class)).size() > 0) {
                value += 1;
            }
            if (ctIf.getCondition().getElements(new TypeFilter<>(CtBinaryOperator.class)).size() > 0) {
                value += 1;
            }
        } else if (statement instanceof CtTry) {

        } else {
            if (statement.getElements(new TypeFilter<>(CtFieldAccess.class)).size() > 0) {
                value += 1;
            }
            if (statement.getElements(new TypeFilter<>(CtBinaryOperator.class)).size() > 0) {
                value += 1;
            }
        }
        if (inLoop != 1) {
            inLoop = checkInLoop(statement);
        }
        return value + inLoop;
    }

    private int checkInLoop(CtStatement statement) {
        int inLoop = 0;
        CtElement parent = statement.getParent();
        while (parent != null) {
            if (parent instanceof CtFor || parent instanceof CtWhile) {
                inLoop = 1;
                break;
            }
            parent = parent.getParent();
        }
        return inLoop;
    }
}
