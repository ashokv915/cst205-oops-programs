public class StringDemo {
    public static void main(String[] args) {
        String s = "www.java.com";

        String[] substr = s.split("\\.");

        for (String i : substr) {
            System.out.println(i);
        }
        //System.out.println(substr[0]);
    }
}
