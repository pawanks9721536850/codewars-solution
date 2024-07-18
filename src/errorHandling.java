import java.util.Scanner ;
import java.util.*;

public class errorHandling {
    public static void main( String [] args ) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" input a number ");
//
//        int a = sc.nextInt();
//        System.out.println(" input second number ");
//        int b = sc.nextInt();
//
//        try {
//            System.out.println("the result of division is " + a / b);
//        }
//        catch (Exception e)
//        {
//            System.out.println("the number "+a+" cannot be divided by zero ");
//        }
//        finally
//        {
//            System.out.println( "hello world ");
//        }

        int arr[] ={5,6,7,8,9} ;

        try
        {
            System.out.println("the result of division is " + (arr[0] /0 ));
        }
        catch ( Exception e )
        {
            try
            {
                for ( int i = 0 ; i < 7  ; i++ )
                {
                    System.out.println( arr[i]) ;
                }
            }
            catch( Exception er)
            {
                // er.printStackTrace();
                System.out.println("exception is : " + er );
            }
        }
    }
}
