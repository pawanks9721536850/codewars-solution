interface myLambda
{
    public void display() ;
}

//class my implements myLambda
//{
//    public void display()
//    {
//        System.out.println("hello world ");
//    }
//}
public class lambdaExpressions {
    public static void main ( String [] args )
    {

//        myLambda n = new myLambda ()
//        {
//            public void display()
//            {
//               System.out.println("hello world ");
//            }
//        };
//        n.display();
         myLambda m = () ->  {
                 System.out.println("hello world ");
                 System.out.println( "hi");
             };
         m.display() ;

    }
}
