
class B
{
    B()
    {
        this(100); // redirecting the parametrized constructor
        System.out.println(this+" this is a current id");
    }
    B(int a)
    {
         
        System.out.println(a);
    }
    void show()
    {
        System.out.println(this);
    }
    public static void main(String []av)
    {
        B r=new B();
        System.out.println(r);
        r.show();
      
    }
}
