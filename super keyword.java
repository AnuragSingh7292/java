class A
{
    int a=10;
    void show()
    {
         System.out.println(a);
        
    }
}
class B extends A
{
    int a=20;
    void show()
    {
        super.show(); //redirect for methods
         System.out.println(a);
        
    }
}

class C
{
    
    C(int a)
    {
         System.out.println("bye");
        
    }
}
class D extends C
{
  
    D()
    {
        super(20); // for redirect parametrized constrctor
         System.out.println("HII");
        
    }
}
class E
{
    
    E()
    {
         System.out.println("bye");
        
    }
}
class F extends E
{
  
    F()
    {
       // "super keywoed automatically added by compiler in the case of same type constrctor
         System.out.println("HII");
        
    }
}


class HelloWorld
{
    public static void main(String [] av)
    {
        B ref=new B();
        ref.show();
        
        D ref1=new D();
        
        F ref2=new F();
    }
}