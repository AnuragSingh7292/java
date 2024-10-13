package anurag;

                    // private method
class A{
    private void show() // you can't use private method from out of the class 
    {
       System.out.print("learn coding....!");
    }
     public static void main (String[] args) {
       A r=new A();
       r.show();
     }
}

// To run the peogram write javac -d . A.java



                        // default method

class A {
     void show() // you can access the default method from out of the class 
    {
       System.out.print("learn coding....!");
    }
     public static void main (String[] args) {
       A r=new A();
       r.show();
     }
}
                //protected method

class A {
    protected void show() // you can access the protected method from out of the class 
    {
       System.out.print("learn coding....!");
    }
     public static void main (String[] args) {
       A r=new A();
       r.show();
     }
}
