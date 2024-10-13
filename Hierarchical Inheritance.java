import java.util.*;
class supper{
    int a,b;
    void input()
    {
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
    }
}

class sub1 extends supper{
    void add()
    {
       System.out.println(a+b);
    }
}
class sub2 extends supper{
    void sub()
    {
       System.out.println(a-b);
    }
}
class sub3 extends supper{
    void mul()
    {
       System.out.println(a*b);
    }
}
class sub4 extends supper{
    void div()
    {
       System.out.println(a/b);
    }
}
class java
{
    public static void main(String[]avg)
    {
        System.out.print("Enter the data : ");
        sub1 r1=new sub1();
        sub2 r2=new sub2();
        sub3 r3=new sub3();
        sub4 r4=new sub4();
        supper ref=new supper();
       ref.input();
        r1.add();
        r2.sub();
        r3.mul();
        r4.div();
    }
        
}
