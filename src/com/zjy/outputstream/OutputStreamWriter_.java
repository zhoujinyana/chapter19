package com.zjy.outputstream;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), "utf-8");
        outputStreamWriter.write("hi,周");
        outputStreamWriter.close();
        
    }
}
