package Patterns.MonotonicStack;

import java.util.Stack;

public class IncreasingStack {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,6};
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>arr[i]){
                stack.pop();
            }
            stack.push(arr[i]);
        }
        System.out.println(stack);
    }
}
