package Basic_Math;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Number to Reverse: ");
        int num = scanner.nextInt();
        int rev = 0;

        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
