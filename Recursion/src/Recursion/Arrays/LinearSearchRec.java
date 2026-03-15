package Recursion.Arrays;

public class LinearSearchRec {
    public static void main(String[] args) {
    int[] arr = {18,19,20,21,22,23,24};
        System.out.println(linearSearchIn(arr,22,0));
    }
    static boolean linearSearch(int[] arr,int target,int index){
        if(index > arr.length-1){
            return false;
        }
        if(arr[0] == target || linearSearch(arr,target,index+1)){
            return true;
        }
        return false;
    }
    static int linearSearchIn(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return linearSearchIn(arr, target, index+1);
        }
    }
}
