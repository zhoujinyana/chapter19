import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        //在默认情况下，输出位置在显示器
        out.println("john,hello");
        //out.close();
        out.write("你好".getBytes());
        out.close();

        //改变输出的位置
        System.setOut(new PrintStream("e:\\a.txt"));
        System.out.println("hello,deal");
        out.close();

    }
}
