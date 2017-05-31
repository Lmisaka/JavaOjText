package oj.java;

import org.junit.Test;

/**
 * Created by OvO on 2017/5/17.
 */
public class JavacTest {
    @Test
    public void java() throws Exception {
        String code = "package java.on;\nimport java.util.Scanner;\npublic class text{\n" +
                "    public static void main(String[] args) throws Exception {\n" +
                "        Scanner in = new Scanner(System.in);\n" +
                "        int i = in.nextInt();\n" +
                "System.out.println(i);\n" +
                "    }\n" +
                "}";
        Javac javac= new Javac();
//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();

        javac.java(code);
    }


}