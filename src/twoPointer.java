import java.util.* ;
import java.util.Scanner ;
class genericArray <T>
{
    T arr [] ;

    genericArray( int s )
    {
        arr = (T[]) new Object[s] ;
        System.out.println("Start inserting the elements in array");
        Scanner sc = new Scanner ( System.in );
        for ( int i = 0 ; i < s ; i++ )
        {
            System.out.println("Enter the "+i+" th element ");
            T temp = (T)sc.nextLine()  ;
            arr[i] = temp ;
        }
    }
    void printElementsOfArray()
    {
        for ( int i = 0 ; i < arr.length ; i++ )
        {
           System.out.print(arr[i]+" ");
        }

    }
   // @Override

}
public class twoPointer {
    public static void main ( String [] args )
    {
        genericArray<String>  a = new genericArray<>(5);
        a.printElementsOfArray();
      //  System.out.println(  );


    }
}
