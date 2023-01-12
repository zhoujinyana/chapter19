package com.zjy.write_;

import java.io.*;

public class BufferCopy_ {
    public static void main(String[] args) {

        //BufferReader 是按照字符读取，不要操作二进制文件，否则可能造成文件损坏
        String srcFilePath = "e:\\a.txt";
        String desFilePath = "e:\\a.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(desFilePath));
            while((line = br.readLine()) != null){
                 bw.write(line);
                 bw.newLine();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
