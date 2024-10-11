import java.util.*;
/*class trial           
{
   int a,b;
    private trial()  
   {
      a=100;
      b=-200;
      System.out.println(a+" "+b);

   }
   // We can access the private data only for same class object of constructor
   public static void main(String[] args) 

   {
      trial ref=new trial();
   }

}*/

class A{
   int a,b;
   private A()
   {
     a=10;b=20;
     System.out.println(a+" "+b);
   }
}
// we can't access the private part form the outside of the class

public class trial {
   public static void main(String[] args) {
      A ref=new A();
   }

   
}
