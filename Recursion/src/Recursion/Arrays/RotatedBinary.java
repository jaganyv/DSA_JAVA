package Recursion.Arrays;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int ans = rBinarySearch(arr,50,0,arr.length-1);
        System.out.println(ans);
    }
    static int rBinarySearch(int[] arr,int target,int start,int end){
        if(start>=end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=start && target<=mid){
                return rBinarySearch(arr,target,start,mid-1);
            }else{
                return rBinarySearch(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]) {
            return rBinarySearch(arr, target, mid + 1, end);
        }
        return rBinarySearch(arr,target,start,mid-1);
    }
}
