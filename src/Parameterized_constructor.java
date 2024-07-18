class parameterizedConstructor  {

   int a ;
   String name ;

   parameterizedConstructor (int x , String s ) {
       a = x;
       name = s;


   }
   parameterizedConstructor ( int x , int y )
   {
       System.out.println ( x +" "+ y ) ;
   }
   void show( )
   {
       System.out.println(a +"   name = " + name );
   }
}
public class Parameterized_constructor {
    public static void main( String [] args )
    {
        parameterizedConstructor ref = new parameterizedConstructor(5,"java trainee") ;
        ref.show() ;
        ref = new parameterizedConstructor(5,6) ;
    }
}
