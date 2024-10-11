import java.util.*;

class A
{
   int x,y,a,b;
   A() 
   {
      x=290;
      y=390;
     System.out.println(x+" "+y);
    
   }

   A(A ref) // Copy constructor
   {
      a=ref.x+10;
      b=ref.y+12;
     System.out.println(a+" "+b);
   
   }
   void show()
   {
      System.out.println(x+" "+y);
   }

}

 class trial {

   public static void main(String[] av)
   {
      A obj=new A();
      obj.show();
      A obj1=new A(obj);
      obj.show();
      
   }
}
