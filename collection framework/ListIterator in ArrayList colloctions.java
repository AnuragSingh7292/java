import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
        ListIterator l = arrlist.listIterator();
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
        while(l.hasPrevious())
        {
            System.out.println(l.previous());
        }

    }

    public static void main(String[] args) {
        work();
    }
}