import java.util.*;

class A 
{
      int a;
      String name;
      boolean c;
   A()     // Default constructor
  {
   a=1025;
   name="Anurag";
   c=true;

  }  

  void display()
  {

        System.out.println(a+" "+name+" "+c);

  }
// Automatically compiler adding the constructor with initializing the by default value 
  int x;
  String y;
  boolean z;
  void show()
  {
      System.out.println(x+" "+y+" "+z);
  }

}

class trial {
    
   public static void main(String [] ab)
   {
      A ref=new A();
      ref.display();
      ref.show();
   }
      

   
}