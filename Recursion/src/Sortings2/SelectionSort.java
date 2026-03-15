package Sortings2;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
        System.out.println("Before Selection Sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));
    }
}
