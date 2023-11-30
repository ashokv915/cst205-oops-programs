import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");

        ListIterator<String> litr = al.listIterator();
        
        while (litr.hasNext()) {
            String element = litr.next();
            System.out.println("Element : "+element);            
        }
    }
}
