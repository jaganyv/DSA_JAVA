package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        functionName(5);
    }
    static void functionName(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        functionName(n-1);
    }
}
