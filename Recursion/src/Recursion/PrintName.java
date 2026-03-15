package Recursion;

import java.util.Scanner;

public class PrintName {
    static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Jagan Yadav ");
        printName(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times: ");
        int n = scanner.nextInt();
        printName(n);
    }
}
