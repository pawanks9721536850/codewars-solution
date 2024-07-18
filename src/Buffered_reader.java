import java.io.BufferedReader ;
import java.io.InputStreamReader ;
//import java.io.InputStreamReader;


public class Buffered_reader {
    public static void main ( String [] args )
    {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            String name = r.readLine();
            System.out.println(name);
        }
        catch(Exception e )
        {
            System.out.println ( e );
        }

    }
}
