
public class throwsException {
    static int calArea ( int a , int b ) throws Exception
    {
        if ( a < 0 || b < 0 )
        {
            throw new Exception ("length and breadth cannot be negative ") ;
        }
        return (a*b);
    }
    static int area ( int a , int b ) {
        try {
            return calArea(a, b);
        } catch (Exception e) {
            System.out.println("the exception is : " + e);
        }
        return Integer.MIN_VALUE;
    }
    public static void main( String [] args )
    {
          int ans = area(-1,6);
          System.out.println("the are of rectangle is "+ans );

    }
}
