import java.util.ArrayList;
import java.util.List;
//import java.util.*;


class Main
{
    public static void work()
    {
        List<Integer> arrlist = new ArrayList<>();

        arrlist.add(1);
        arrlist.add(10);
        arrlist.add(100);
        arrlist.add(1000);
        System.out.println(arrlist);
        for(int i : arrlist)
        {
            System.out.println(i);
        }
        System.out.println(arrlist.remove(2));
        System.out.println(arrlist.get(2));
        arrlist.set(0,100);
        System.out.println(arrlist);
        System.out.println(arrlist.contains(1001));
        System.out.println(arrlist.size());
        System.out.println(arrlist.iterator());
        arrlist.clear();
        System.out.println(arrlist.size());

    }

    public static void main(String[] args) {
        work();
    }
}