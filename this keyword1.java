
class B
{
    B()
    {
        System.out.println(this);
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
