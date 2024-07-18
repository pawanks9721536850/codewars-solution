public class calculator {
    public  static int  add ( int  a , int  b )
    {
        return a+b ;
    }
    public static int subtract ( int a , int b )
    {
        return a - b;
    }
    public static int mul ( int a , int b )
    {
        return a * b;
    }
    public static float division ( int a , int b )
    {
        return a / b ;
    }

    public static void main ( String [] args )
    {
        int a = 10 , b = 5 ;
        System.out.println ( "the result of addition : " + add ( a, b ) ) ;
        System.out.println ( "the result of subtraction : " + subtract ( a ,b ) );
        System.out.println ( "the result of multiplication : " + mul(a , b )) ;
        System.out.println ( "the result of division : " + division ( a , b )) ;
    }
}
