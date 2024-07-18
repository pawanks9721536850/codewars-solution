//class myThread extends Thread
//{
//    public void run()
//    {
//        for ( int i = 0 ; i < 30 ; i++ )
//        {
//            System.out.println("hello");
//        }
//    }
//}
public class threadDemo extends Thread {
    public  void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("hello");
        }
    }
        public static void main (String [] args ){
            threadDemo t = new threadDemo();
            t.start();
            for (int i = 0; i < 30; i++) {
                System.out.println("hi");
            }
        }

}