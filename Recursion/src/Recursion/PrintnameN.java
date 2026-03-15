package Recursion;

public class PrintnameN {
    public static void main(String[] args) {
        printName(5);
    }
    static void printName(int n){
        if(n<=0){
            return;
        }
        System.out.println("Jagan Yadav");
        printName(n-1);

    }
}
