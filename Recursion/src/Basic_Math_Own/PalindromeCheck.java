package Basic_Math_Own;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Number to Check for Palindrome: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;

        while(number!=0){
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number/=10;
        }

        if(original == reversed){
            System.out.println("Yes it is an palindrome..");
        }else{
            System.out.println("No it is not a palindrome..");
        }
    }
}
