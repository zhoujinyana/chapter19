package com.zjy.inputstream;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
         String filePath = "e:\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");

        BufferedReader br = new BufferedReader(isr);
//等价于：BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"););
        String s = br.readLine();
        System.out.println(s);

        br.close();



    }
}
