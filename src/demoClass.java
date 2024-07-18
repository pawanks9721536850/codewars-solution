import java.util.Scanner ;
class demo
{
    int a ;
    String str ;

    void show ()
    {
        System.out.println(a +" "+str );
    }
    demo ()
    {
        int get = 0 ;
        System.out.println( "input the number ");
        Scanner s = new Scanner(System.in);
        get = s.nextInt() ;
        this.a= get ;

        System.out.println("input the string ");
       // Scanner sc = new Scanner ( System.in) ;
        String temp = s.nextLine() ;

        //this.a = get ;
        this.str = temp ;

    }

}
public class demoClass
{
    public static void main ( String [] args )
    {
       demo ref = new demo () ;
       ref.show() ;
    }
}