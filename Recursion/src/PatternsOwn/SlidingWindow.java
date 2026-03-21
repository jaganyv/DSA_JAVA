package PatternsOwn;

public class SlidingWindow {
    static int slidingWindow(int[] arr,int k){
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        int maximumSum = windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k]+arr[i];
            maximumSum = Math.max(windowSum,maximumSum);
        }
        return maximumSum;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8};
       int k = 3;
       int ans = slidingWindow(arr,k);
        System.out.println(ans);
    }
}
