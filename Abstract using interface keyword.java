import java.util.*;
interface vehical
{
    String name="TVS";     // public + static + final 
    int speed=100;        // public + static + final
    void start();    // public + abstract
    void stop();     // public + abstract

    default void color()
    {
        System.out.println("The TVs color is red ");
    }
    static void speed()
    {
        System.out.println("The speed of TVS is "+speed +" km/h");
    }
}
class  customer implements vehical
{
    public void start()
    {
        System.out.println("Insert the key and press the button to start");
    }
    public void stop()
    {
        System.out.println("Exit the key to stop");
    }
    public static void main(String [] av)
    {
          customer obj= new  customer();

        obj.color();
        vehical.speed();
        obj.start();
        obj.stop();

        
    }
}




