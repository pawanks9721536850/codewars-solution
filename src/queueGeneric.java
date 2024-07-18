import java.util.*;
class myQueue<T>
{
     ArrayList <T> queueDs ;

    myQueue ()
    {
        queueDs =  new ArrayList<T>() ;
    }
    void push( T a )
    {
        if ( queueDs.size()  == 0 )
        {
            queueDs.add(a);

        }
        else
        {
            queueDs.add(a);

        }
    }
    void pop()
    {
        if (queueDs.size() == 0 )
        {
            return ;
        }
        else
        {
            queueDs.removeFirst();
        }
    }
    T peek()
    {
        return queueDs.getFirst();

    }
    T last()
    {
        return queueDs.getLast();
    }
}
public class queueGeneric {
    public static void main( String args[] )
    {
        myQueue<Integer> q = new myQueue<Integer>();
         q.push(10);
         q.push(20);
         q.push(30);
         q.push(40);
         q.push(50);
         q.push(60);
         q.pop() ;
         Integer f = q.peek() ;
         System.out.println("the peeked element is : " +f);
         q.pop() ;
         f= q.peek() ;
         System.out.println("the peeked element is : " +f);
         Integer l = q.last() ;
         System.out.println("the last element is : " +l);
    }
}
