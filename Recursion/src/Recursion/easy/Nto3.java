package Recursion.easy;

public class Nto3 {
    static int sum;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rev = n % 10;
        sum = sum * 10 + rev;
        rev1(n/10);

    }
    public static void main(String[] args) {
    rev1(54321);
        System.out.println(sum);
    }

}
