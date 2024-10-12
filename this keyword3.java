
class B
{
    B()
    {
        System.out.println(this+" this is a current id");
    }
    B(int a)
    {
        this(); // redirecting the default constructor
        System.out.println(a);
    }
    void show()
    {
        System.out.println(this);
    }
    public static void main(String []av)
    {
        B r=new B(100);
        System.out.println(r);
        r.show();
      
    }
}