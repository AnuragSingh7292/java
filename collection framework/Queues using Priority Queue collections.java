
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main
{
    public static void work()
    {
        // min heap
        Queue<Integer> minP = new PriorityQueue<>();
        minP.offer(10);
        minP.offer(100);
        minP.add(5);
        minP.add(1);
        minP.add(50);
        minP.add(30);

        System.out.println("min-heap priority queuea ");
        System.out.println(minP);
//        for(int i : minP)
//        {
//            System.out.println(i);
//        }
        System.out.println(minP.poll());
        System.out.println(minP.poll());
        System.out.println(minP.poll());
        System.out.println(minP.poll());
        System.out.println(minP.poll());
        System.out.println(minP.poll());
        System.out.println(minP.poll());

        System.out.println(minP.peek());
        System.out.println(minP.peek());


// max heap using Comparator reverseOrder()
        Queue<Integer> maxP = new PriorityQueue<>(Comparator.reverseOrder());
        maxP.offer(10);
        maxP.offer(100);
        maxP.add(5);
        maxP.add(1);
        maxP.add(50);
        maxP.add(30);
        System.out.println("max-heap priority queuea ");
        System.out.println(maxP);
//        for(int i : maxP)
//        {
//            System.out.println(i);
//        }
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());
        System.out.println(maxP.poll());

        System.out.println(maxP.peek());
        System.out.println(maxP.peek());

    }
    public static void main(String[] args) {
        work();
    }
}