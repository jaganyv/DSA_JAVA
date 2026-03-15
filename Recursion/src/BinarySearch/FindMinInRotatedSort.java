package BinarySearch;

public class FindMinInRotatedSort {
    static int findMin(int[] arr){
        int low = 0 , high = arr.length-1;
        while(low<high){
            int mid = high + (low-high) / 2;
            if(arr[mid]>arr[high]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = findMin(arr);
        System.out.println(ans);
    }
}
