   import java.util.*;
   public class trial
   {
      public static void main(String []av)
      {
        int []arr;

        int arr1[]={1,6,3,1,5,6,7,0,9,10}; // 1st method

        Arrays.sort(arr1);          // to sort the arry

        for(int i :arr1)    // using foe each loop
        {
            System.out.print(i+" ");
        }

        System.out.println(); // for next line 
        int arr2[]=new int[10];  // 2 method

         Scanner obj=new Scanner(System.in);
        System.out.println("Enter the arry Element : ");
        
        for(int i=0;i<10;i++)
        {
           arr2[i]=obj.nextInt();
        }
         Arrays.sort(arr2);
        for(int i :arr2)
        {
            System.out.print(i+" ");
        }
        
        

      }
   }
