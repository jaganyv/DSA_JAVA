package Stack_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek());

    }
}
