class SuspendThread implements Runnable
{
    String name;
    Thread t;
    boolean suspendFlag;

    SuspendThread(String threadName)
    {
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New Thread "+t);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for(int i=15; i>0;i--)
            {
                System.out.println("Name : "+name+":"+i);
                Thread.sleep(200);
                synchronized(this)
                {
                    while (suspendFlag) {
                        wait();//Current thread to wait, until it is awakened, using notify() or interruption
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Exiting : "+name);
    }

    synchronized void mysuspend()
    {
        suspendFlag = true;
    }
    synchronized void myresume()
    {
        suspendFlag = false;
        notify();
    }
}


public class SuspendResume {
    public static void main(String[] args) {
        SuspendThread ob1 = new SuspendThread("One");
        SuspendThread ob2 = new SuspendThread("Two");

        ob1.t.start();
        ob2.t.start();

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending Thread One");
            ob1.myresume();
            System.out.println("Resuming Thread One");
            
            ob2.mysuspend();
            System.out.println("Suspending Thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming Thread Two");
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
    }
}
