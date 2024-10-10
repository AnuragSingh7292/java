import java.util.*;

public class trial 
{
    public static void main(String []av)
    { 
       int a;
       int b;
       int c;
       int e=10;
       Scanner obj=new Scanner(System.in);
       System.out.println("Entre the number : ");
       a=obj.nextInt();
       b=obj.nextInt();
       c=obj.nextInt();

       int d=(a>b)?(a>c?a:c):(b>c?b:c);  // 3 variable
       System.out.println(d);
       int f=(a>b? a:b > c ? b:c > e ? c:e); // 4 variable
       System.out.println(f);
       System.out.println((a>b ? a:b >c ? b:c)); // 3 variable

      
    }


    
}
