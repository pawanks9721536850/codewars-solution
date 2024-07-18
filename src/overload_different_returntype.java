
public class overload_different_returntype {

    void show ( int a , int b )
    {
        System.out.println ( a +"   "+b );
    }

    public static void main( String [] args )
    {
        overload_different_returntype obj = new overload_different_returntype();
        obj.show( 15 , 16 ) ;



    }


}
