package Recursion_Basics;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println("Factorial Of Given Number is: " + ans);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
