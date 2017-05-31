package com.ssm.util.exam;

import java.io.*;

/**
 * Created by OvO on 2017/5/24.
 */
public class JavaUnit {
    /**
     * 将程序输入写到输入文件，用于测试用户代码
     *
     * @param input
     * @throws FileNotFoundException
     */
    public void writeInputFile(String input) throws FileNotFoundException {
        PrintStream ps = new PrintStream("input.txt");
        System.setOut(ps);
        System.out.println(input);
        ps.close();
        System.setOut(System.out);
    }

    /**
     * 检测用户代码的输出是否正确
     * @param rightOutPut 程序的正确输出
     * @return 检测结果
     * @throws IOException
     */
    public boolean IsOutPutCorrect(String rightOutPut) throws IOException {
        boolean result = false;
        System.out.println();
        //读取输出文件的全部内容
        System.out.println(System.getProperty("user.home"));
        File file = new File("classpath:output.txt");
        byte[] fileContent = new byte[((Long) file.length()).intValue()];
        FileInputStream in = new FileInputStream("classpath:output.txt");
        in.read(fileContent);
        String outPut=new String(fileContent,"utf-8");
        if(rightOutPut.trim().equalsIgnoreCase(outPut.trim()))
            result=true;
        return result;
    }
}
