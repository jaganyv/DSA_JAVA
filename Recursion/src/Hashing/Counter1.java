package Hashing;

public class Counter1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2};

        System.out.println(counter(arr,1));
    }
    public static int counter(int[] arr,int target){
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                counter++;
            }
        }
        return counter;
    }
}
