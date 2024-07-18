import java.util.*;
import java.math.BigInteger;


public class sample_add {
//    public static int az  ;
//    public static void myFun ( )
//    {
//        System.out.print( "this is my function ") ;
//        int a = 1 ;
//        System.out.println ( "    "+ a ) ;
//    }
    public static void main ( String [] args  )
    {
//        int a = 10 , b = 300 ;
//        System.out.println ( a + b ) ;
//
//        myFun() ;
//
//       System.out.println ( az );

//        long n = 456987 ;
//        String number = Long.toString(n);
//        long a = n%10 ;
//        int last = int(a);
//        System.out.println(a);
//        System.out.println(number);
        String s ="helloworld";
        ArrayList<Integer> arr = new ArrayList<>(List.of(4,5,6));
        //arr.addAll(List.of{'a' , 'b','c'});
        Integer a = arr.getLast();
        System.out.println(arr.getLast());

        if( arr.getLast() == 6)
        {
            System.out.println("6");
        }

        BigInteger dividend = new BigInteger("12345678901234567890");
        BigInteger modulus = new BigInteger("98765432109876543210");

        // Compute dividend % modulus
        BigInteger result = dividend.mod(modulus);

        System.out.println("Modulus of " + dividend + " and " + modulus + " is:");
        System.out.println(result);

    }
}
