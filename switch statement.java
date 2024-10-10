import java.util.*;

public class trial {
    public static void main(String []av)
    { 
       int arr[]={1,2,3,4,5};
       switch(2)  // switch STATEMENT
       {
        case 1:
        {
           System.out.println("BREAK STATEMENT ");
           for(int i:arr)
           {

              if(i==4)  
               break;     // break statement  
               System.out.println(i);
        
           }

           break;
        }
           case 2:
           {
             System.out.println("CONTINUE STATEMENT ");
              for(int j: arr)
              {

              if(j==3)
               continue;        // continue statement

               System.out.println(j);
              }
              break;
            }
         }
    }
}
