import java.util.Scanner;
class loop {
    public static void main(String[] args) 
    {
        int num;
        System.out.print("Enter the any number for table : ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(num +"x"+i+" = "+num*i);
        }
    }
}
