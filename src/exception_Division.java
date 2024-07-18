import java.util.Scanner ;
public class exception_Division {
     int add ( int a , int  b )
     {
         return a+b ;
     }
     int sub ( int a , int  b )
     {
         return a-b ;
     }
     int mul ( int  a, int  b )
     {
         return a*b ;
     }
     void div ( int a , int  b )
     {
         try
         {
             double ans = (a/b) ;
             System.out.println ( " the result of division is : " + ans  );
         }
         catch ( Exception e )
         {
             System.out.println( " the number cannot be divided by zero , the error is : " + e ) ;
         }
     }
    public static void main ( String[] args )
    {
        Scanner myObj = new Scanner ( System.in ) ;
        exception_Division A = new exception_Division() ;

        System.out.println ( " enter the first number ") ;
        int a = myObj.nextInt () ;

        System.out.println ( " enter the second number ");
        int b = myObj.nextInt () ;

        System.out.println ( " the result of addition is  : " + A.add(a,b) );
        System.out.println ( " the result of subtraction is : "+ A.sub(a,b));
        System.out.println ( " the result of multiplication is :"+ A.mul(a,b));
        A.div( a, b );


    }
}
