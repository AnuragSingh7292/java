
import java.util.Scanner;
class do_while
{
    public static void main(String[] args) 
    {
        int num;
      System.out.print("Enter the any number which is less than 20 : ");
      Scanner obj=new Scanner(System.in);
      num=obj.nextInt();
      System.out.println("Given number"+ " " +num);
      // do while loop 
      do
      {
          System.out.println("No Given number is not greater of 20 >"+" "+num--);
         
      }
      while(num>=20);
      
      // while loop
       while(num>=20)
       {
               System.out.println("No Given number is not greater of 20 >"+" "+num--);
       }
    }
}
