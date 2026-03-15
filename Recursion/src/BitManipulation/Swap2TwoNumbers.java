package BitManipulation;

public class Swap2TwoNumbers {
    public static void main(String[] args) {
        swapNumber(10,20);
    }
    static void swapNumber(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("A:" + a);
        System.out.println("B:" + b);
    }
}
