import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.setProperty("name","tom");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//        properties.store(new FileOutputStream("src\\dog.properties"),null);

        String filePath = "src\\dog.properties";
        properties.load(new FileReader(filePath));
        String name = properties.get("name")+ "";
        int age = Integer.parseInt(properties.get("age") + "");
        String color = properties.get("color")+"";

        Dog dog = new Dog(name,age,color);
        System.out.println(dog);
//序列化
        String path = "e:\\dog.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();


    }

    //反序列化
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String path = "e:\\dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Dog dog = (Dog)objectInputStream.readObject();
        System.out.println(dog);
        objectInputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}