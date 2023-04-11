package Preprocess;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Prepare {
    List<String> seeds = null;
    Config config;

    public Prepare(Config config) throws IOException {
        this.config = config;
        try (Stream<Path> paths = Files.walk(Paths.get(config.getSeedsPath()))) {
            //获取 paths 中所有文件的路径字符串列表
            // /home/dgx/JOpFuzzer/JOpFuzzer/compiler/conversions/LoopStripMiningIter_main_on 文档
            // /home/dgx/JOpFuzzer/JOpFuzzer/compiler/stable/TestStableUByte.java  JAVA测试代码
            seeds = paths.filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error: seed path is not valid");
            System.exit(1);
        }
    }

    public void preprocess() throws IOException {
        //初始配置下 separator="/"   separator分离器
        String separator = System.getProperty("file.separator");
        RelationMapping map = new RelationMapping();
        BufferedWriter out = new BufferedWriter(new FileWriter("encodeClass.log")); // the encoded class will be written to this file
        int i = 0;
        for (String seed : seeds) {
            //筛选出java文件   &&!seed.contains("TestNestedLocksElimination")
            if (seed.endsWith(".java")&& ++i<600&&
                    !seed.contains("TestStringObjectInitialization")&&!seed.contains("TestLongBoxing")&&
            !seed.contains("TestInstanceCloneAsLoadsStores")&&!seed.contains("TestArrayCopyAsLoadsStores")&&
            !seed.contains("Boxing")&&!seed.contains("TestDeoptOOM")&&!seed.contains("TestArrayCopy")&&
            !seed.contains("ConvI2LWideningAssertTooStrong")&&!seed.contains("Test8202414")&&
                    !seed.contains("Test6792161")&&!seed.contains("Test6851282")&&!seed.contains("IVTest")&&
                    !seed.contains("Tester")&&!seed.contains("DekkerTest")&&!seed.contains("TestStringIntrinsics")&&
                    !seed.contains("PowerOf2SizedArraysChecks")&&!seed.contains("SumTest")&&
                    !seed.contains("TestSquareToLen")&&!seed.contains("TestMultiplyToLen")&&
                    !seed.contains("spectrapredefineclass_classloaders/Agent.java")&&!seed.contains("Test8211698")
                    &&!seed.contains("TestDivZeroCheckControl")&&!seed.contains("TestRangeCheckPredicatesControl")
                    &&!seed.contains("TestFuzzPreLoop")&&!seed.contains("CRCTest")&&!seed.contains("Test6942326")
                    &&!seed.contains("StartupOutput")&&!seed.contains("MulExactIRepeatTest")
                    &&!seed.contains("PartialPeelingUnswitch")&&!seed.contains("TestIntAtomicOrdered")
                    &&!seed.contains("TestFoldCompares")&&!seed.contains("TestMulAdd")&&!seed.contains("TestNestedLocksElimination")) {
                out.write(seed + "\n");
                out.flush();
                Config seedConfig = config.clone();
                //种子路径/home/dgx/JOpFuzzer/JOpFuzzer/compiler/conversions 去除java文件
                seedConfig.setSeedPath(seed.substring(0, seed.lastIndexOf(separator)));
                //种子名称  JAVA文件名
                seedConfig.setSeedName(seed.substring(seed.lastIndexOf(separator) + 1));
                //标记种子中每个方法包含的特征
                List<Encode> encodes = encodingMethod(seed, seedConfig);
                map.mapping(encodes, seedConfig);
                clearHotSpotLog();
            }
        }
        out.close();
        map.calculateFinalRelationship();
        map.saveArray();
    }

    public List<Encode> encodingMethod(String classNameWithPath, Config seedConfig) {
        //classNameWithPath 种子，包含路径+名称 seedConfig 种子配置设置了路径和名词
        //Launcher负责调用HotSpot的核心代码对JVM执行初始化，以及由它负责维护JVM的整个生命周期
        Launcher launcher = new Launcher();
        //在启动Java应用程序时，可以使用此方法来指定要加载的资源，从而影响应用程序的行为。
        launcher.addInputResource(classNameWithPath);
        launcher.buildModel();
        //在运行时修改和生成Java类；CtModel表示整个程序的抽象语法树模型；包含了所有的类、接口、方法、字段等元素，并提供了一系列API来访问和操作这些元素
        CtModel model = launcher.getModel();
        //获取程序中所有的包：com.example.package1
        Collection<CtPackage> packages = model.getAllPackages();
        for (CtPackage p : packages) {
            //CtPackage.getPackages获取当前包中所有子包的列表 com.example.package1.subpackage1
            if (p.getPackages().size() == 0) {
                if (!p.toString().equals("unnamed package"))
                    seedConfig.setPackageName(p.toString());
            }
        }
        //获取程序中所有方法
        List<CtMethod> methods = model.getElements(new TypeFilter<>(CtMethod.class));
        List<Encode> encodes = new ArrayList<>();
        for (CtMethod method : methods) {
            //标记方法包含的特征
            Encode encode = new Encode(method);
            if (!encode.uselessMethod) {
                encodes.add(encode);
            }
        }
        return encodes;
    }

    public void clearHotSpotLog() {
        File dir = new File(".");
        File[] files = dir.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.getName().endsWith(".log") && file.getName().startsWith("hotspot_pid")) {
                file.delete();
            }
        }
    }

}