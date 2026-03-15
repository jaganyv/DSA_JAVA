package Basic_Math;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        if(n==0){
            count = 1;
        }
        n = Math.abs(n);
        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println("Total Count is: " + count);
    }
}
