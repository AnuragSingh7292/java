import java.util.*;
abstract class bank
{
    abstract void Deposite();
    abstract void widthdraw();
    abstract void checkBalance();
}
class bank_services extends bank
{
    private double bal=1000;
    private int pswd=123;
    public double money;
    Scanner r1=new Scanner(System.in);
    public void Deposite()
    {
        int pass;
        System.out.println("Enter your Deposite money : ");
        money=r1.nextDouble();
        System.out.println("Enter your password : ");
        pass=r1.nextInt();
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
    public void widthdraw()
    {
        int pass;
        System.out.println("Enter your widthdraw money : ");
        money=r1.nextDouble();
        System.out.println("Enter your password : ");
        pass=r1.nextInt();
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
        pass=r1.nextInt();
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

class java_2 
{
    public static void main(String [] av)
    {
        int i=0,ch;
        Scanner r=new Scanner(System.in);
        bank_services ref=new bank_services();
        System.out.println("1.To deposite money");
        System.out.println("2.To widthdraw money");
        System.out.println("3.To check balance");
        System.out.println("Enter the number");
        ch=r.nextInt();
        switch(ch)
        {
            case 1:
            ref.Deposite();
            break;
            
            case 2:
            ref.widthdraw();
            break;
            case 3:
            ref.checkBalance();
            break;
            
            default: 
             System.out.println("Invailed input");

        }
    }
}


