package Basic_Math;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while(num!=0){
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num = num / 10;
        }
        if(sum == original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not ArmStrong Number");
        }
    }
}
