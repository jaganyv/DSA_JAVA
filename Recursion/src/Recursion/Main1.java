package Recursion;

public class Main1 {
    public static void main(String[] args) {
        //What is recursion , a function that calls itself until the specific base condition meets to avoid stack overflow
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
