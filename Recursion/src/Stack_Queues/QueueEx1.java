package Stack_Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
