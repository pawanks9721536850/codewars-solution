import java.util.*;
import java.lang.Integer ;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main( String [] args )
    {
        List<Integer> arr = new ArrayList<>(List.of(10,20,30,23,50,69)) ;
        List<Integer> odd = new ArrayList<>() ;

        odd = arr.stream().filter( n ->  n%2 != 0 ).collect(Collectors.toList());
        System.out.println(odd);
    }
}
