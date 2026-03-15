package Recursion;

public class BaseCondition {
    int count = 0;
    void function1(){
        if(count==4){
            return;
        }
        System.out.println(count);
        count++;
        function1();
    }
    public static void main(String[] args) {
        BaseCondition bc = new BaseCondition();
        bc.function1();
    }
}

/*
What i have learned in the recurstion video
what is recursion
base case
stack overflow
recursion tree
 */
