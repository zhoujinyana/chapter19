package com.zjy.outputstream;

import java.io.*;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        //序列化后文件格式是按照他的格式来保存
        String filePath = "e:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.1);
        oos.writeUTF("周晋燕");
        oos.writeObject(new Dog("May",2));
        oos.close();
        System.out.println("序列化形式保存完毕");


    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}