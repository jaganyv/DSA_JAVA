package Basic_Math;

import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Divisor to check divisor: ");
        int num = scanner.nextInt();

        for(int i=1;i<=num;i++){
            if(num % i == 0){
                System.out.println(i+ " ");
            }
        }
    }
}
