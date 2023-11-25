class NewThreadOne extends Thread
{
    NewThreadOne()
    {
        super("Demo thread");
        System.out.println("Child Thread"+this);
    }

    public void run()
    {
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thread "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted"+e);
        }

        System.out.println("Child exiting");
    }
}


class ExtendThread
{
    public static void main(String[] args) {
        
        NewThreadOne nt = new NewThreadOne();
        nt.start();

        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting ");
    }
}