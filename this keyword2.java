
class B
{
    int a;
    // B(int a) 
    // {
    //   a=a;  //this is whitout this keyword jvm get confused
    // }
    B(int a)
    {
        this.a=a;//this is whit this keyword jvm get print actual value
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String []av)
    {
        B r=new B(100);
        r.show();
      
    }
}
