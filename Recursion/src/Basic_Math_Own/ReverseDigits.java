package Basic_Math_Own;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Number to be reversed: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while(num!=0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
