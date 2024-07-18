class A
{
    int a ;
    String name ;

    A ()
    {
        a = 45;
        name = "pawan" ;

    }

    void show ()
    {
        System.out.println(a +" "+name);
    }

}
public class Default_constructor {

    public static void main(String[] args) {


        A ref = new A();
        ref.show();
    }
}
