import java.util.* ;
//import java.lang.Integer ;
class myArray <T>
{
    T arr[];

    void print()
    {
        for ( int i = 0 ; i < 5 ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
    }
    myArray ( int s )
    {
        arr = (T[]) new Object[s];
        //arr = new

        System.out.println("enter numbers ");
        Scanner sc = new Scanner( System.in);
        for ( int i = 0 ; i < 5 ; i++ )
        {
            Integer temp = sc.nextInt() ;
            arr[i] = (T)temp ;
            //System.out.println(arr[i]);
        }

    }
}
public class genericClass {
    public static void main( String [] args )
    {
           //int temparr[]={5,4,3,2,1};

           myArray<Integer> a = new myArray<>(5 );
           a.print() ;


    }
}
