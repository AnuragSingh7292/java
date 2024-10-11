import java.util.*;

class A 
{
      int a;
      String name;
  A()
  {
     
      System.out.println("This is a constructor");
       a=0;
       name="anurag";

  } 

  void show()
  {

        System.out.println(a+" "+name);

  }

}

class trial {
    
   public static void main(String [] ab)
   {
      A obj=new A();
      obj.show();
   }

   
}