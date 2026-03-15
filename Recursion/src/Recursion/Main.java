package Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println(function1());
    }
    public static boolean function1(){
        System.out.println("Hello function 1");
        function1();
        return false;
    }
}
