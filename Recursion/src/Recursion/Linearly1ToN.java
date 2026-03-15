package Recursion;

import java.util.Scanner;

public class Linearly1ToN {

    void printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Linearly1ToN l1 = new Linearly1ToN();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        l1.printN(n);
    }
}
