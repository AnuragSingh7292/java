
import java.util.*;
   public class trial
   {
      public static void main(String []av)
      {
         String str="Anurag";   // immutable

         System.out.println(str.length());      // To finding the length

         System.out.println(str.toUpperCase());  // To converting in upper case 
         
         System.out.println(str.toLowerCase());   // to conveting in lower case 
         
         String str1=new String("Anurag");

         System.out.println(str==str1); // TO comparing the location of both string 

         System.out.println(str.equals(str1)); // to caparing the value of both string
         
         str.concat(  " kumar");   // Tring to change the object of string 
        
         System.out.println((str));   // (Anurag) "Nothing will be change"

         String str2=str.concat(" kumar"); // Dublicate copy of string

         System.out.println(str2);  // change the o/p (Anurag kumar)

      }

   }
