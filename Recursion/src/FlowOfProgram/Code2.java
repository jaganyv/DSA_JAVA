package FlowOfProgram;

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = scanner.nextInt();
        int c = 2;
        while(c<num){
            if(num%c==0) {
                System.out.println("Not Prime Number");
                c++;
            }
        }
            System.out.println("Prime Number");

    }
}
