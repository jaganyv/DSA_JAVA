package Stack_Queues;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
