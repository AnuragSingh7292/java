
import java.util.LinkedList;
//import java.util.*;


class Main
{
    public static void work()
    {
       LinkedList<Integer> LL = new LinkedList<>();
       LL.add(1);
       LL.add(10);
       LL.add(100);
       LL.add(1000);
       LL.add(10000);
       LL.add(100000);
       LL.add(1000000);
        System.out.println(LL);
        System.out.println(LL.poll());
        System.out.println(LL.pollFirst());
        System.out.println(LL.pollLast());
        System.out.println(LL.clone());
       LL.clear();
        System.out.println(LL.isEmpty());


    }
    public static void main(String[] args) {
        work();
    }
}