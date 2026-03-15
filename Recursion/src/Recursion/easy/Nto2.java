package Recursion.easy;

public class Nto2 {
    public static void main(String[] args) {
        int result = productDigits(55);
        System.out.println(result);
    }
    static int product(int n){
        if(n<=1){
            return 1;
        }
        return n * product(n-1);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    static int productDigits(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * productDigits(n/10);
    }
}
