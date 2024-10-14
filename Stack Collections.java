
import java.util.Stack;

class main1{
    public static void main(String[] args) {
        Stack<String> Name=new Stack<String>(); // LIFO OPERATION
        // to insert data uisng add or push
        Name.add("Anurag");
        Name.add("Kumar");
        Name.add("rajput");
        Name.push("Singh");
        System.out.println(Name);
        // to delete data using pop and remove

        System.out.println(Name.pop());

        System.out.println(Name);


    }
}