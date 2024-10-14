import java.io.*;
class main1{
    public static void main (String[] args)
    {
        // 1st method to handling the exception using try catch
        File f=new File("C:\\Users\\anura\\OneDrive\\Desktop\\LC.txt");
        try{

            if(f.createNewFile())
            {
                System.out.print("File Successfully Created....!");
            }
            else
            {
                System.out.print("File Alreay exits>>>!");
            }
        }
        catch (IOException e)
        {
            System.out.print("Exception handled>>>!");
        }
    
             // 2nd method to handling the exception using throws
    public static void main (String[] args)
            throws IOException {

        File f=new File("C:\\Users\\anura\\OneDrive\\Desktop\\LC.txt");

        if(f.createNewFile())
        {
            System.out.print("File Successfully Created....!");
        }
        else
        {
            System.out.print("File Alreay exits>>>!");
        }
    }

}
