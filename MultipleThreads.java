class MultiThread implements Runnable
{
    String name;
    Thread t;

    MultiThread(String name)
    {
        this.name = name;
        t = new Thread(this,name);
        System.out.println("Thread : "+name);
    }

    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println(this.name + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }

        System.out.println(this.name + "exiting");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        MultiThread mt1 = new MultiThread("Thread One ");
        MultiThread mt2 = new MultiThread("Thread Two ");
        MultiThread mt3 = new MultiThread("Thread three ");

        mt1.t.start();
        mt2.t.start();
        mt3.t.start();

        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}
