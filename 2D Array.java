   import java.util.*;

import javax.security.sasl.SaslException;
   public class trial
   {
      public static void main(String []av)
      {
        int a[][]=new int[2][2];
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Matrix element : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("Given Matrix element is : ");
        for (int i=0;i<2;i++) 
        {
             for (int j=0;j<2;j++)
             {
                System.out.print(a[i][j]+" ");

             } 
           System.out.println();
        }
        
      }
   }
