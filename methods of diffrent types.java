import java.util.*;

public class trial 
{
    public static void main(String []av)
    { 
       int a;
       int b;
       int c;
       Scanner obj=new Scanner(System.in);
       System.out.println("Entre the number : ");
       a=obj.nextInt();
       b=obj.nextInt();
       c=obj.nextInt();
       trial obj1=new trial();  //  making object to call user defined function other types 
       System.out.println(obj1.sum(a,b));
    }

     int sum(int a,int b)
    {
        return(a+b);
    }
}
