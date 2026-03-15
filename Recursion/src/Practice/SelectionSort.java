package Practice;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr){
       int n = arr.length;
       for(int i=0;i<n-2;i++){
           int minIndex = i;
           for(int j=i;j<=n-1;j++){
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
        int[] arr = {20,50,44,77,12,1};
        System.out.println("Before Selection Sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));
    }
}
