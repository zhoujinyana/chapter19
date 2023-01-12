package com.zjy.reader_;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;//按行读取
        //当返回空时，
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        //要关闭buffer即可，不需要再关闭file
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
