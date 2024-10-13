class A
{
    
    void div()
    {
        int a,b;
        a=10;
        b=0;
    
    try 
    {
        int c=a/b;
        System.out.println(c);
    } 
    catch(ArithmeticException e) 
    {
        System.out.println("can't divide by "+b);
    }
    
    System.out.println("Program end ");
        
    }
    
   public static void main (String[] args) 
   {
       A r=new A();
       r.div();
    }
}

