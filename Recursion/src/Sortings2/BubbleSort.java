package Sortings2;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        boolean isSwapped;
        for(int i=0;i<arr.length;i++){
            isSwapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Before bubble sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After bubble sort: " + Arrays.toString(arr));
    }
}
