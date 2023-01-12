package com.zjy.outputstream;

import java.io.*;
//二进制拷贝
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "e:\\a.txt";
        String destFilePath = "e:\\a.txt";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            byte[] buff = new byte[1024];
            int rendLen = 0;
            while((rendLen = bis.read(buff)) != -1){
                bos.write(buff,0,rendLen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
