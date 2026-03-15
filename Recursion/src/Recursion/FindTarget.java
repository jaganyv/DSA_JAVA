package Recursion;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int target = 20;
        System.out.println(findTarget(arr,target,0));
    }
    static boolean findTarget(int[] arr,int target,int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[0] == target || findTarget(arr,target,index+1)){
            return false;
        }
        return true;
    }
}
