public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread "+t);

        //Change the name of the Thread
        t.setName("My thread");

        System.err.println("After changing name "+t);

        try {
            for(int n=5;n>0;n--)
            {
                System.err.println(n);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.err.println("Main thread interrupted");
        }
    }
}
