                    // multiple inheritance 
// class A{
//      void show()
//      {
//          System.out.println("This is a class A");
//      }
// }
// class B{
//      void show()
//      {
//          System.out.println("This is class B");
//      }
//  }
            // multiple inheritance using interface
            
    // 1st method
interface A{
    void show();
}
interface B{
    void show();
}
class multiple implements A,B {
     public void show()
     {
         System.out.println("interface A & B" );
     }
 }
 
 // 2nd method
interface C{
    void dis();
}
interface D{
    void show();
}
class multiple1 implements C,D{
    
    public void show()
     {
         System.out.println("interface D" );
     }
     public void dis()
     {
         System.out.println("interface C" );
     }
}
class java
{
    public static void main (String[] args)
    {
        multiple ref=new multiple();
        ref.show();
        
        multiple1 ref1=new multiple1();
        ref1.show();
        ref1.dis();
    }
}
