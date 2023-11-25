import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, false);
        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        pw.flush();
    }
}
