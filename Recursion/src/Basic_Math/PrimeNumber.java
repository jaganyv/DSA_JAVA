package Basic_Math;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number to check whether it is prime or not: ");
        int num = scanner.nextInt();

        boolean isPrime = true;
        if(num <= 1){
            System.out.println("Not a Prime");
            return;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
