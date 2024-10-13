import java.io*;
class fileWriter{
    
    public static void main (String[] args) {
        /* code */
        
        try {
            
            FileWriter f=new FileWriter("path\\ name");
            try
            {
                f.Write("Java programing is the best language...!");
            }
            finally
            {
                f.close();
            }
            System.out.print("Succesfully data wrote in file ");
            
        } 
        catch(ioException e) 
        {
            System.out.print(e);
        }
    }
}
