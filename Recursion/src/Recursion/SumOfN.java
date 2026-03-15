package Recursion;

import java.util.Scanner;

public class SumOfN {
    static int sumN(int n){
        if(n==0){
            return 0;
        }
        return n+sumN(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum :" + sumN(n));
    }
}
