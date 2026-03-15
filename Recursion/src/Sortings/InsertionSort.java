package Sortings;

import java.util.Arrays;

public class InsertionSort{

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9, 1};

        System.out.println("Before Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Insertion Sort:  " + Arrays.toString(arr));
    }
}

