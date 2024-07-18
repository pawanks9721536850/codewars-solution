public class addition_overloading {
     public  int addition ( int a , int b )
    {
        System.out.println ( "the method is called from integer's method ") ;
        return a+b ;

    }
    public  float addition ( float a , float b )
    {
        System.out.println ( "the method is called from float's method ");
        return a+b ;

    }
    public double addition ( double a , double b )
    {
        System.out.println ( "the method is called from double's method ");
        return a+b ;
    }
    public static void main ( String [] args )
    {
        addition_overloading ref= new addition_overloading() ;
        double x = 5.623654d , y = 7.632161d;
        float first = 5.696f , second = 7.6456f ;
        int ans_int = ref.addition ( 5 , 6 );
        System.out.println (ans_int) ;
        float ans_float = ref.addition ( first , second );
        System.out.println ( ans_float ) ;
        double ans_double = ref.addition( x, y );
        System.out.println ( ans_double );

    }
}
