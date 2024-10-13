            // compile time polymorphism
            // static polymorphism
            // early binding 
class A
{
    void add()
    {
        int x=10,y=29,c;
        c=x+y;
        System.out.println(c);
    }
    void add(int a, int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    
    void add(int a,int b,int d)
    {
       int c;
        c=a+b+d;
        System.out.println(c);
    }
    
    void add(int a, int b,int d,int e)
    {
      int c;
        c=a+b+d+e;
        System.out.println(c);
    }
    public static void main(String[] avg)
    {
        A obj=new A();
        obj.add();
        obj.add(100,200);
        obj.add(100,300,200);
        obj.add(320,60,400,100);
        
    }
    
    
}
