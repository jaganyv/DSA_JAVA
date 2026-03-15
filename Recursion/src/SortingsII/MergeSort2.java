package SortingsII;

import java.util.ArrayList;
import java.util.List;

public class MergeSort2 {
    static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low , right = mid + 1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right <=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high) / 2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
