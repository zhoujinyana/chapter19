package com.zjy.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String lin = "";
        while((lin = br.readLine()) != null){
            String[] split = lin.split("=");
            System.out.println(split[0]+":"+split[1]);
        }
        br.close();

    }
}
