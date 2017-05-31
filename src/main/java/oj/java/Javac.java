package oj.java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Javac {

    /**
     * Java编译程序入口
     *
     * @param code     用户代码
     * @param fullName 类名
     * @throws Exception 编译错误
     */
    public Long complier(String code, String fullName) throws Exception {
        DynamicEngine de = DynamicEngine.getInstance();
        Object instance = de.javaCodeToObject(fullName, code);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTask<Long> futureTask = new FutureTask<>(() -> {
            Long start = System.currentTimeMillis();
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream("input.txt"));
            System.setIn(fis);
            PrintStream ps = new PrintStream("output.txt");
            System.setOut(ps);
            instance.getClass().getMethod("main", String[].class).invoke(null, (Object) new String[]{"1"});
            fis.close();
            ps.close();
            return System.currentTimeMillis() - start;
        });
        executor.execute(futureTask);
        Thread.sleep(2000);
        try {
            if (futureTask.isDone())
                return futureTask.get(2000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            //超时处理
            return Long.valueOf(-1);
        } catch (Exception e) {
            //其他错误
        }
        return Long.valueOf(0);
    }

    /**
     * 入口函数
     * @param code
     * @throws Exception
     */
    public void java(String code) throws Exception {
        String fullName = "";
        String regex = "([\\w\\s])*(public\\sclass)\\s\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        if (matcher.find()) {
            fullName = matcher.group(0).replace("public class ", "");
        }
        fullName = fullName.replace("\n", "");
        code = code.replaceFirst("^package.+;\\s", "");
        System.out.println(complier(code, fullName));
    }
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("input.txt"));
//            FileInputStream fis = new FileInputStream("F:\\code\\JavaOjText\\src\\main\\java\\oj\\java\\input.txt");
        System.setIn(fis);
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        System.out.println(i);
        fis.close();
    }
}

//package java;
//public class text{
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    }
//}
