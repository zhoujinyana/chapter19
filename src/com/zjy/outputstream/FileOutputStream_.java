package com.zjy.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {

            fileOutputStream = new FileOutputStream(filePath,true);//每执行一次，就追加一次文本
            fileOutputStream.write('H');
            String str = "hello,world";
            fileOutputStream.write(str.getBytes());

            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
