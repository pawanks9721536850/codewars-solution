import java.lang.String ;

public class returntype_check {
    public static long sum ( long a  , long b )
    {
        long ans = a+b ;
        System.out.println ( "the result is : " + ans );
        return ans ;
    }
    public static void main ( String [] args )
    {
        int a = Integer.MAX_VALUE ;
        int b = Integer.MAX_VALUE ;
        System.out.println ( a + "   " + b );
        long ans = sum ( a, b );
        System.out.println (  "the sum is : " +ans ) ;

        String s = new String ( "pawan");
       StringBuffer sb = new StringBuffer(s);
       //sb.append(" hello world ");
       System.out.println(sb);
       StringBuilder str = new StringBuilder ( sb ) ;
       System.out.println(str);












    }
}
