
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main
{
    public static void work() {
//        duplicate key is not allowed in hashmap
    Map<Integer,Integer> m = new HashMap<>();
    m.put(1,1);
    m.put(2,2);
    m.put(3,3);
    m.put(4,4);
    m.put(5,5);
    m.put(6,6);
    m.putIfAbsent(2,2);  // if 2 key are not present in map then this kewy will be inserted
        System.out.println(m);
//        for(int i : m.keySet())
//            System.out.println(i);
//        for(int i : m.values())
//            System.out.println(i);
        System.out.println(m.remove(2));


    }
    public static void main(String[] args) {
        work();
    }
}