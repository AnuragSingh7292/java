import java.util.Scanner;
import java.lang.System;
class B
{
    public static void main(String anu[])
    {
        int a,b;
        System.out.println("Enter two number: ");
        Scanner obj=new Scanner(System.in); // for take i/p in run time 
        a=obj.nextInt();// taking i/p for integer, for double nextDouble, for Character nextChar, for float nextFloat
        b=obj.nextInt(); // takin i/p for integer
        System.out.println("Sum of Two Number is :- "+(a+b));
    }
}
