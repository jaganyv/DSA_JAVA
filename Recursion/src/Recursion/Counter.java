package Recursion;

public class Counter {
    int count = 0;
    void function(){
        System.out.println(count);
        count++;
        function();
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.function();
    }
}
