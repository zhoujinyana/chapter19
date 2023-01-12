package com.zjy.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
