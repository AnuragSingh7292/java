class shape
{
    
    void draw()
    {
        System.out.print("Can't say the shape type");
    }
}
 class square extends shape
 {
    @Override
     void draw()
     {
        // super.draw();  to access doth method
       System.out.print("Square shape");
     }
 }
class A{
      public static void main(String[]avg)
      {
          shape r=new square();
          r.draw();
      }
  }