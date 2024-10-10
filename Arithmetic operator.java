import java.util.*;

public class trial {
    public static void main(String []av)
    { 
       int a;
       int b;
       int exp;
       Scanner obj=new Scanner(System.in);
       System.out.println("Entre the number : ");
       a=obj.nextInt();
       b=obj.nextInt();
       
       int i=0;
       while(i<=4)
       {
        System.out.println("Enter the Expresion ");
       exp=obj.nextInt();
       switch (exp)
        {
        case 1:
            System.out.println("The sum of number is = "+ (a+b));
            break;
          
        case 2:
            System.out.println("The sum of number is = " +(a-b));
            break;
        case 3:
            System.out.println("The sum of number is = "+(a*b));
            break;
        case 4:
            System.out.println("The sum of number is = "+(a/b));
            break;
        default:
        System.out.println("Invalid input");
            break;
       }
       i=i+1;
    }


    }
}
