package com.zjy.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStream_ {
    public static void main(String[] args) {

    }
    //单个字节读取
    @Test
    public void readFile01(){
        String filePath = "e:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try{
         fileInputStream = new FileInputStream(filePath);
        //返回-1，表示读取完
            while((readData = fileInputStream.read()) != -1) {
                System.out.print((char)readData);

            }
    }
        catch(IOException e){
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    //read【byte】读取文件
    @Test
    public void readFile02(){
        String filePath = "e:\\hello.txt";
        int readData = 0;
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(filePath);
            //读取正常，返回字节数
            while((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));

            }
        }
        catch(IOException e){
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



}
