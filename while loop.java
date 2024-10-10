
import java.util.Scanner;
class loop {
    public static void main(String[] args) 
    {
        int num;
        System.out.print("Enter the any number for table : ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        
        while(num>=0)
        {
            if(num%2==0)
            System.out.println("EVEN");
            else
            System.out.println("ODD");
            num--;
        }
    }
}