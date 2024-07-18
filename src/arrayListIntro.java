import java.util.* ;

public class arrayListIntro {
    public static void main ( String [] args )
    {
        ArrayList<Integer> al1 = new ArrayList<>(List.of(90,10,20,30))  ;
        System.out.println ( al1 ) ;
        al1.add(96) ;
        al1.add(58) ;
        System.out.println ( al1 ) ;
        ArrayList<Integer> al2 = new ArrayList<>(List.of(91,92));
        al1.addAll(0, al2);
        System.out.println( al1 ) ;

        al1.remove(4);
        System.out.println( al1 ) ;
//        al1.removeAll(al2);
//        al1.retainAll(al2);
//        al1.clear() ;

        ArrayList<Integer> al3 = new ArrayList<>(List.of(90,91,92)) ;
        System.out.println(al1.contains(96));
//        System.out.println(al1.containsAll(al3));
        System.out.println ( al1.isEmpty() );

        System.out.println( al1 ) ;


        ArrayList<Integer> al4 = new ArrayList<Integer>( List.of(10,20,30));
        ArrayList<Integer> al5 = new ArrayList<Integer>( List.of(10,20,30));
        System.out.println ( al4.equals(al5)) ;
        System.out.println ( al1.size() );

        al1.add(6,-1);
        //al1.remove(6);
        System.out.println(al1.subList( 2,4 ));
        List<Integer> al6 = new LinkedList<Integer> () ;
        al6 = al1.subList(1,5);

        System.out.println( al6 ) ;



        Iterator <Integer> it = al1.iterator() ;
        while ( it.hasNext() )
        {
            System.out.println(it.next() );
        }



        System.out.println ( "-------------------------------------------------------") ;

        LinkedList<Integer> ll1 = new LinkedList<Integer>() ;
        ll1.add(8);
        LinkedList<Integer> ll2 = new LinkedList<Integer>(List.of(4,5,6)) ;
        ll1.addAll(ll2);
        System.out.println(ll1);
        System.out.println(ll1.get(3)) ;
        System.out.println(ll1.indexOf(4));
        ll1.forEach(n->System.out.println(n));

        ll1.addFirst(-19) ;
        ll1.addLast(-96)  ;

        Iterator<Integer> iter = ll1.iterator()  ;
        while ( iter.hasNext() )
        {
            Integer temp = iter.next() ;
            System.out.println( temp );
        }


    }
}
