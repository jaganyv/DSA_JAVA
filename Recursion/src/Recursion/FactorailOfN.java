package Recursion;

import java.util.Scanner;

public class FactorailOfN {
    static int Fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n+Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of : " + Fact(n));
    }
}
