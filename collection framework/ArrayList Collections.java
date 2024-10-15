import java.util.ArrayList;

class main1{
    public static void main(String[] args) {
        ArrayList<String> Name=new ArrayList<String>();
        // to insert data
        Name.add("Anurag");
        Name.add("Kumar");
        Name.add("rajput");
        System.out.println(Name);
        Name.add(1,"Singh");
        System.out.println(Name);
        // to remove
        Name.remove(1);
        System.out.println(Name);
        // to repalce
        Name.set(0,"babu");
        System.out.println(Name);
        // to access one data
        System.out.println(Name.get(0));
        // to delete all data
        Name.clear();
        System.out.println(Name);
    }
}
