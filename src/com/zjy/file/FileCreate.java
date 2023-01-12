package com.zjy.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    //第一种
    @Test
    public void create01()  {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件创建成功");

    }

    //第二种
    @Test
    public void create02(){
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String parentFile = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

