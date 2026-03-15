package Sortings;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Bubble Sort:  " + Arrays.toString(arr));
    }
}

