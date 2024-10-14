import java.util.ArrayDeque;
class main1{
    public static void main(String[] args) {
        ArrayDeque<String> Name=new ArrayDeque<String>(); // LIFO OPERATION
        // to insert data uisng add
        Name.add("Anurag");
        Name.add("Kumar");
        Name.add("rajput");
        Name.add("Singh");
        System.out.println(Name);
        // to delete data using remove
        System.out.println(Name.remove());
        System.out.println(Name);


    }
}