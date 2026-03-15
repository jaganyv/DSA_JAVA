package BinarySearch;

public class UpperBound {
    static int upperBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]>target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int target = 9;
        int result = upperBound(arr,target);
        System.out.println("The Upper Bound is: " + result);
    }
}
