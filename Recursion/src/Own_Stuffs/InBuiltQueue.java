package Own_Stuffs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addLast(2);
        deque.removeFirst();

        System.out.println(deque);

    }
}
