package com.zjy.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file = new File("e:\\news1.txt");
        System.out.println("文件大小："+file.length());
    }
}
