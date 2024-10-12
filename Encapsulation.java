import java.util.*;
class bank
{
    private double bal=10000;
    private int pswd=123;

    public void Deposite(double money)
    {
        int pass;
        System.out.println("Enter your password : ");
        Scanner obj=new Scanner(System.in);
        pass=obj.nextInt();
        if(pswd==pass)
        {
            bal=bal+money;
            System.out.println("Your deposite money is "+money);
            System.out.println("Your total balance is "+bal);
        }
        else
        {
            System.out.println(" Incorrect password ");
        }
        

    }

    public void widthdraw(double money)
    {
        int pass;
        System.out.println("Enter your password : ");
        Scanner obj=new Scanner(System.in);
        pass=obj.nextInt();
        if(pswd==pass)
        {
            if(bal>=money)
            {
               bal=bal-money;
               System.out.println("Your widthdrawl money is "+money);
               System.out.println("Your total balance is "+bal);
            }
            else
            {
                System.out.println("Not sufficient balance");
            }
        }
        else
        {
            System.out.println("Incorrect password");
        }

    }
    public void checkBalance()
    {
        int pass;
        System.out.println("Enter your password : ");
        Scanner obj=new Scanner(System.in);
        pass=obj.nextInt();
        if(pswd==pass)
        {
            System.out.println("Your total balance is "+bal);
        }
        else
        {
            System.out.println("Incorrect password ");
        }
        
    }
}

class java 
{
    public static void main(String [] av)
    {
        int i=0,ch;
        double money,money1;
        Scanner r=new Scanner(System.in);
         bank ref=new bank();
        System.out.println("1.To deposite money");
        System.out.println("2.To widthdraw money");
        System.out.println("3.To check balance");
        System.out.println("Enter the number");
        ch=r.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter your Deposite money : ");
            money=r.nextDouble();
            ref.Deposite(money);
            break;
            
            case 2:
            System.out.println("Enter your widthdraw money : ");
            money1=r.nextDouble();
            ref.widthdraw(money1);
            break;
            case 3:
            ref.checkBalance();
            break;
            
            default: 
             System.out.println("Invailed input");

        }
    }
}

