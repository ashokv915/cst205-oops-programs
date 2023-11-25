import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile
{
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        try{
            fin = new FileInputStream("sample.txt");
        }catch(FileNotFoundException e)
        {
            System.out.println("No such file exits");
            return;
        }

        try {
            do{
                i = fin.read();
                if (i != -1) {
                    System.out.println(i);
                }
            }while(i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading file");
        }
        finally
        {
            try {
                fin.close();
            } catch (Exception e) {
                System.out.println("Error Closing the file");
            }
        }
    }
}