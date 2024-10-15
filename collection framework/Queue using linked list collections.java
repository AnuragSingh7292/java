
//import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Main
{
    public static void work()
    {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(10);
        qu.add(100);
        qu.add(1000);
        qu.add(10000);
        System.out.println(qu);
        for(int i : qu)
        {
            System.out.println(i);
        }
//        System.out.println(qu.remove());
        System.out.println(qu.peek());
        qu.poll();
        qu.poll();
        System.out.println(qu);


    }
    public static void main(String[] args) {
        work();
    }
}