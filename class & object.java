import java.util.*;

public class trial 
{
  int age =21;
  int weight=62;
  String color="Black";
   void eat()
   {
      System.out.println("Now, i'm eating");
   }
   void sleep()
   {
      System.out.println("Now, i'm sleeping");
   }
   public static void main(String [] av)
   {
      trial p=new trial();
      System.out.println(p.age);
      System.out.println(p.weight);
      System.out.println(p.color);
      p.eat();
      p.sleep();
   }
}