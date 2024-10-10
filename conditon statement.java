
import java.util.Scanner;
class con {
    public static void main(String[] args) 
    {
        int marks;
        System.out.print("Enter the marks: ");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if(marks >= 80  && marks <= 100)
        {
            System.out.println("First division");
        }
        else if(marks >= 60 && marks <= 80)
        {
            System.out.println("Second division");
            
        }
        else
        {
            System.out.println("Failed..");
        }
       
       
    }
}
