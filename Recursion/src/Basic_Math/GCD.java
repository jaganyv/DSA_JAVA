package Basic_Math;

import java.util.Scanner;

public class GCD {
    //It is nothing but HCF Highest Common factor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
    }
}
