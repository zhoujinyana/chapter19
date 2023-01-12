import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) {
        String filePath = "e:\\a.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while((line = br.readLine()) != null){
                System.out.println(++lineNum + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
