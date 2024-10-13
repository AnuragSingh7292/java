import java.util.*;
class superclass
{
    int a,b;
    
    void input()
    {
          Scanner r=new Scanner(System.in);
          a=r.nextInt();
          b=r.nextInt();
    }
    void add()
    {
        System.out.println(a+b);
    }
}
class sub1 extends superclass
{
    void sub()
    {
        System.out.println(a-b);
    }
}
class sub2 extends sub1
{
    void mul()
    {
        
        System.out.println(a*b);
    }
}
class sub3 extends sub2
{
    void div()
    {
        
        System.out.println(a/b);
    }
}
class java
{
    public static void main(String[]avg)
    {
        sub3 obj=new sub3();
       System.out.println("Enter the data : ");
       obj.input();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        
    }
}