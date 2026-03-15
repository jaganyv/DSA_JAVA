package Recursion_Basics;

public class PrintBackwards {
    public static void main(String[] args) {
    printNum(5);

    }
    static void printNum(int n){
        System.out.println(n);
        if(n == 1){
          return;
        }

        printNum(n-1);

    }
}
