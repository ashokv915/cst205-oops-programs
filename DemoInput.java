import java.io.*;

class DemoInput
{
    public static void main(String[] args) {
        char c=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters");
        do
        {
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.write(c);
        }while(c != 'q');
    }
}