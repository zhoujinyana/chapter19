import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\mytemp";
        File file = new File(filePath);
        if(!file.exists()){
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }

        }
        String file1 = filePath + "\\hello.txt";
        file = new File(file1);
        if(!file.exists()){
            if(file.createNewFile()){
                System.out.println("成");

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("helloworld");
                bufferedWriter.close();
            }else{
                System.out.println("失败");
            }
        }else{
            System.out.println("文件已经存在");
        }


    }
}
