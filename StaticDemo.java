public class StaticDemo {
    public static void main(String[] args) {
        int e = FirstStaticDemo.i;
        System.out.println(e);
    }
    
}

class FirstStaticDemo
{
    static int i=5;
    int j=0;
}
