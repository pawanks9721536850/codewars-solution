import java.util.Scanner ;

public class first_program{
    int add ( int a , int b )
    {
        return a+b ;
    }
    void div ( int a , int b )
    {
        try
        {
            double ans = a/b ;
            System.out.println ( "the result of division is " + ans ) ;
        }
        catch(Exception e)
        {
            System.out.println( "the number cannot be divided by zero , the error is : "+ e);
            //return 0;
        }
    }
    public static void main ( String [] args )
    {
        Scanner myObj = new Scanner ( System.in ) ;
        first_program A = new first_program() ;

        System.out.println ( "input the first number ") ;
        int a = myObj.nextInt() ;

        System.out.println ( "input the second number ") ;
        int b = myObj.nextInt() ;

        //System.out.println  ( "the output of addition is : "+ add(a,b)) ;
//        int ans = A.add( a , b ) ;
//        System.out.println ( " the result of addition is :"+ ans );

         A.div( a , b );
       // System.out.println( "the result of division is :" + ans );





    }
}