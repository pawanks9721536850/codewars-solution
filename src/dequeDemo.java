import java.util.*;
import java.util.Map.* ;
class myComp implements Comparator<Integer>
{
    public int compare  ( Integer o1 , Integer o2 )
    {
        if ( o1 < o2 ) return 1;
        if ( o1 > o2 ) return -1 ;
        return 0 ;
    }
}
public class dequeDemo {
    public static void main (String [] args )
    {
        System.out.println ( "deque like STACK ");
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>() ;
        dq.addLast(-1 );
        dq.addLast( -2);
        dq.addLast( -3);


        Iterator<Integer> it = dq.iterator() ;
        while ( it.hasNext() )
        {
            System.out.println (it.next() ) ;
        }


        System.out.println( "--------------------------------------");
        System.out.println( "Priority Queue");

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( /*new myComp() */ ) ;
        pq.offer(3);
        pq.offer(5);
        pq.offer(20);
        pq.offer(10);
        pq.offer(15);
        pq.offer(-1);
        //pq.poll() ;
        System.out.println( pq );


        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;
        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;
        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;
        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;
        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;
        System.out.println ( "peek :" + pq.peek() );
        pq.poll() ;


        System.out.println( "------------------------------------------");
        System.out.println( "HashSet");

        HashSet <Integer> hs = new HashSet <Integer> () ;
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        System.out.println(hs);
        //hs.clear() ;
        //System.out.println(hs);

        System.out.println( hs.size() );
        System.out.println( hs.contains(10) );
        System.out.println( hs.remove(10) );
        System.out.println( hs.isEmpty() );


//        class abc {
//
//        }
//        abc ABC = new abc();
//        String s = ABC.toString() ;
//        int a   = ABC.hashCode();
//
//        System.out.println( ABC.toString() );
//        //System.out.println( ABC.hashCode() );
//
//        System.out.println( s );
//        System.out.println( a );


        System.out.println ( "--------------------------------------------");
        System.out.println("TreeSet :---> sorted set (log(n)) for adding and removing ");

        TreeSet <Integer> ts = new TreeSet<Integer>(List.of(10,-1,-3,20,0,-15)) ;
        System.out.println( ts );



        System.out.println ( "--------------------------------------------");
        System.out.println ( "TreeMap  :--> ");

        TreeMap <Integer, String > tm = new TreeMap<> (Map.of ( 1,"pawan" , 2 , "kumar" , 3 , "singh"));

        tm.put(4,"taazaa");
        Entry<Integer , String > e = tm.firstEntry();

        System.out.println ( e.getKey() +"   "+ e.getValue()  );

        System.out.println (tm);





    }
}
