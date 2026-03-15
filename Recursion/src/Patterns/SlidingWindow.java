package Patterns;

public class SlidingWindow {

    //Sum of maximum Subarray of k
    static int slidingWindow(int[] arr,int k){
        int wSum = 0;
        for(int i=0;i<k;i++){
            wSum += arr[i];
        }
        int mSum = wSum;
        for(int i=k;i<arr.length;i++){
            wSum = wSum - arr[i-k] + arr[i];
            mSum = Math.max(wSum,mSum);
        }
        return mSum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int k = 3;
        int ans = slidingWindow(arr,k);
        System.out.println(ans);
    }
}
