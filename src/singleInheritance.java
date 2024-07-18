class addition
{
    int a ,  b ;
    addition ()
    {

    }
    addition( int x , int y )
    {
        a =x ;
        b =y ;
    }

    int addMethod ( )
    {
        int ans = a+b ;
        System.out.println ( "called from addMethod   "+ ans ) ;
        return ans ;
    }
}
class multiplication extends addition
{
    int p, q ;

    multiplication ( int x1 , int x2 )
    {
        p = x1 ;
        q = x2 ;
    }

    int mulMethod ( )
    {
        int ans = (p * q);
        System.out.println ( "called from multiply method  "+ ans ) ;
        return ans ;
    }
}

public class singleInheritance {
    public static void main ( String [] args )
    {
        addition obj = new addition ( 5 , 10) ;
        obj.addMethod() ;

        multiplication obj1 = new multiplication( 10 , 3) ;
        int ans1 =  obj1.addMethod() ;
        obj1.a = 15 ;
        obj1.b = 2 ;
        obj1.addMethod() ;
        int ans2 =  obj1.mulMethod() ;

    }
}
