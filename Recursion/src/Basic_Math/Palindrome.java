package Basic_Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number to check palindrome: ");
        int num = scanner.nextInt();
        int original = num;
        int rev = 0;
        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(original == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
