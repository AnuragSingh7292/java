import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//import java.util.*;


class Main
{
    public static void work()
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(10);
        st.push(100);
        st.push(1000);
        st.push(10000);
        st.push(100000);
        st.push(1000000);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.remove(1));
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.contains(100));
        System.out.println(st.set(1,10));
        System.out.println(st);
        st.insertElementAt(10000000,5);
        System.out.println(st);
        System.out.println(st.search(1));
        System.out.println(st.isEmpty());
        st.clear();
        System.out.println(st.isEmpty());

    }
    public static void main(String[] args) {
        work();
    }
}