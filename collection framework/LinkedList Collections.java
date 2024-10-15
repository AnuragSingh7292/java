
import java.util.LinkedList;

class main1{
    public static void main(String[] args) {
        LinkedList<String> Name=new LinkedList<String>();
        // to insert data
        Name.add("Anurag");
        Name.add("Kumar");
        Name.add("rajput");
        System.out.println(Name);

        // to add at beging
        Name.add(1,"Singh");
        Name.addFirst("Anura");
        System.out.println(Name);
        // to add at last
        Name.addLast("Raj");
        // to remove
        Name.remove(1);
        System.out.println(Name);
        // to repalce
        Name.set(0,"babu");
        System.out.println(Name);
        // to access one data
        System.out.println(Name.get(0));
        // to delete all data


        for(String str:Name)
        {
            System.out.println(str);
        }

        Name.clear();
        System.out.println(Name);
    }
}