
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main
{
    public static void work() {
        // it ordered collactions but does not allowed the duplicate 
    Set<Integer> set = new LinkedHashSet<>();
    set.add(10);
    set.add(3);
    set.add(5);
    set.add(100);
    set.add(100);
        System.out.println(set);
        System.out.println(set.remove(100));
        System.out.println(set.contains(3));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
    public static void main(String[] args) {
        work();
    }
}