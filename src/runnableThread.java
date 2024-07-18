//class myThread implements Runnable
//{
//    public void run ( )
//    {
//        for ( int i = 0 ; i < 30 ; i++ )
//        {
//            System.out.println("hello ");
//        }
//    }
//}
//public class runnableThread {
//    public static void main( String [] args )
//    {
//        myThread m = new myThread () ;
//        Thread t = new Thread(m);
//        t.start() ;
//
//        for ( int i = 0 ; i < 45 ; i++ )
//        {
//            System.out.println( "hi");
//        }
//
//    }
//}


public class runnableThread implements Runnable  {

    public void run ( )
    {
        for ( int i = 0 ; i < 30 ; i++ )
        {
            System.out.println("hello ");
        }
    }
    public static void main( String [] args )
    {

        runnableThread m = new runnableThread () ;
        Thread t = new Thread(m);
        t.start() ;

        for ( int i = 0 ; i < 45 ; i++ )
        {
            System.out.println( "hi");
        }

    }

}