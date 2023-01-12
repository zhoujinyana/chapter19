package com.zjy.write_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello，zjy");
        bufferedWriter.newLine();//插入一个换行符
        bufferedWriter.write("hello，zjy");

        //关闭外层包装流即可
        bufferedWriter.close();
    }
}
