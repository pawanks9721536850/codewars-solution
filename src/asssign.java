 class A1
 {
     int x ;
     int y ;
     A1(){
         System.out.println(" ");
     }
     A1(int x , int y)
     {
         this.x = x ;
         this.y  = y ;
     }
     public void addition ()
     {
         int  sum = x+y ;
         System.out.println("The sum " +sum);
     }
 }
 class B extends  A1
 {
     int  a;
     int b ;
     B()
     {
         //System.out.println("");
     }
     B ( int a , int b )
     {
         this.a = a ;
         this.b = b ;
     }
//     B (int a , int b , int x , int y )
//     {
//         this.a = a ;
//         this.b = b ;
//         this.x = x ;
//         this.y = y ;
//     }
     void multiplication ()
     {
         int  product = (a*b) ;
         System.out.println("The product is " +product);
     }
 }
 class asssign
 {
     public static void main(String[] args) {
         int m = 10 ;
         int n = 11;
         B obj = new B(m,n);
         obj.multiplication();
         obj.addition() ;

     }
 }
