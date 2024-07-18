class copy_Constructor {
    int a;
    String name;

    copy_Constructor( int x , String s )
    {
        a = x ;
        name = s ;
    }
    copy_Constructor( copy_Constructor ref)
    {
        a = ref.a ;
        name = ref.name ;
    }
    void show ( )
    {
        System.out.println ( a +"   " + name );
    }
}
public class copyConstructor {
    public static void main( String [] args )
    {
        copy_Constructor obj = new copy_Constructor(15 , "pawan ") ;
        obj.show() ;

        copy_Constructor obj2 = new copy_Constructor(obj) ;
        obj2.show() ;
    }
}
