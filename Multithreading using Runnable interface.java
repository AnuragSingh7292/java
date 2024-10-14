class A implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 6; i++) {
            System.out.println("Anurag");
        }
    }
}

class main1{
    public static void main(String[] args) {
        A r=new A();
        Thread t=new Thread(r);
        t.start();

        for (int i = 0; i < 6; i++) {
            System.out.println("kumar");

        }

    }
}