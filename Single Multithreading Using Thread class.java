import java.time.chrono.ThaiBuddhistChronology;

class A extends Thread
 {
     public void fun()
     {
         try {
             for (int i = 0; i < 5; i++) {
                 System.out.println("anurag");
                 Thread.sleep(1000);
             }
         }
         catch (InterruptedException i)
         {

         }
     }
 }

 class main1{
     public static void main(String[] args) throws InterruptedException {
        A t=new A();
        t.fun();
        for (int i=0;i<5;i++)
        {
            System.out.println("kumar");
            Thread.sleep(1000);
        }
     }
 }