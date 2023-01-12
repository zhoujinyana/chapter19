package com.zjy.write_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_ {
    public static void main(String[] args) {
        String filePath = "e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write('H');//写入单个字符
            fileWriter.write(chars);
            fileWriter.write("周晋燕".toCharArray(),0,3);
            fileWriter.write("你好，北京");
            fileWriter.write("上海世博会",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();//一定要关闭流，不然数据写不到文件里
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
