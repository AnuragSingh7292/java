class student
{
     int roll,marks;
     String name;
     // we can't use private method or data in other class 
    //  protected can be access
    //  private void input1()
    //  {
    //   System.out.println("Enter the name & marks : ");
    //  }
     void input()
     {
       System.out.println("Enter the name & marks : ");
     }
}
 class anurag extends student
 {
     void dis()
     {
         roll=1; name="anurag"; marks=91;
         System.out.println(name+" "+roll+" "+marks);
     }
 }
 class java
 {
     public static void main(String[]avg)
     {
         anurag obj=new anurag();
         obj.dis();
        //  obj.input1(); we can't access the private method form the other class
         obj.input();
     }
 }
