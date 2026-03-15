package FlowOfProgram;

import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int input = scanner.nextInt();
        if(input<=1){
            System.out.println("Neither Prime nor Composite");
            int c = 2;
            while(c*c <= input){
                if(input%2==0){
                    System.out.println("Not Prime");
                }
                c = c+1;
                break;
            }
            System.out.println("Prime Number");
        }
    }
}
