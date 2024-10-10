//import java.lang.System;
class A {
    int a=2; // instance variable 
    static double b=4; // static variable 
    public static void main(String[] a)
    {
        boolean c=true; //local variable  
        A obj=new A();
        // for multiple line
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(c);
        // for one line 
        System.out.println(obj.a+" "+b+" "+c);// concatenation
    }
}