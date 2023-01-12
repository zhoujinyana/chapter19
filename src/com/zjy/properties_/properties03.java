package com.zjy.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //如果该文件没有这个key就是创建，有的话就是修改
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","tom");

        properties.store(new FileOutputStream("src\\mysql2.properties"),"helloworld");
        System.out.println("保存文件配置成功");
    }
}
