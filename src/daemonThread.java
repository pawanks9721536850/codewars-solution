class daemonThreadTest extends Thread
{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello");
        }
    }
}
public class daemonThread  {
    public static void main( String [] args ) throws Exception
    {
        daemonThreadTest t = new daemonThreadTest();
        t.setDaemon(true);
        Thread mainThread = Thread.currentThread() ;

        //mainThread.join();

        t.start() ;

        for ( int i = 0 ; i < 20 ; i++ )
        {
            System.out.println("world");
        }
    }
}
