import java.util.*;
abstract class animal
{
    void legs()
    {
        System.out.println("All animal have for legs...");
    }
    abstract void sound();
    abstract void eat();
}
class dog extends animal{
    void sound()
    {
        System.out.println("Bow Bow...");
    }
    void eat()
    {
        System.out.println("Dog can be eat meat, rice....");
    }
}
class cow extends animal
{
    void sound()
    {
        System.out.println("Maaa Maaa...");
    }
    void eat()
    {
        System.out.println("Dog can be eat grass, rice....");
    }
}
class java_2 
{
    public static void main(String [] av)
    {
        dog obj=new dog();
        cow obj1=new cow();
        obj.legs();
        obj.sound();
        obj.eat();

        obj1.legs();
        obj1.sound();
        obj1.eat();
        
    }
}


