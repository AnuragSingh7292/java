import java.util.*;

class A
{
   int x;
   A(int a,String y) // parameterized constructor
   {
     System.out.println(a+" "+y);
    x=a+=10;
   }

   A(int a,boolean y) // parameterized constructor
   {
     System.out.println(a+" "+y);
     x=a+=10;
   }
   void show()
   {
      System.out.println(x);
   }

}

 class trial {

   public static void main(String[] av)
   {
      A obj=new A(10,"Anurag");
      obj.show();
      A obj1=new A(100, false);
      obj.show();
      
   }
}