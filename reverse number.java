import java.util.*;
public class trial{
    public static void main(String []av)
    { 
        int num=12345678;
        int num1=num;
        int temp=0;
        while(num!=0)
        {
            temp=temp*10+num%10;
            num/=10;
        }

        System.out.print("The reverse number of " + num1 +" is = "+temp);

    }  
}

