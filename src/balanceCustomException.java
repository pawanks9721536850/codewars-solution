import java.util.Scanner ;

class exceptionOfAge extends Exception
{
    public String toString()
    {
        return "age cannot be negative or zero ";
    }
}

public class balanceCustomException {
    public static void main( String [] args )
    {
        int age ;
        Scanner sc = new Scanner ( System.in ) ;
        age = sc.nextInt () ;

               if ( age <= 0  ) {
                   try {
                       throw new exceptionOfAge();
                   }
                   catch(exceptionOfAge e )
                   {
                       System.out.println( e );
                   }
               }
               else
               {
                   System.out.println ( "the age is : "+age ) ;
               }


    }
}
