package Recursion.Arrays;

import java.util.Scanner;

public class Palindrome {
    static boolean palindrome1(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return palindrome1(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an String: ");
        String s = scanner.nextLine();
        if(palindrome1(s,0,s.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
