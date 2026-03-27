package Arrays.Easy;

import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array in-place.
     * Returns the number of unique elements.
     */
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 1; // pointer for unique elements

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[j - 1]) {
                arr[i] = arr[j];
                i++;
            }
        }

        return i; // count of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int uniqueCount = removeDuplicates(arr);

        System.out.println("Unique Count: " + uniqueCount);
        System.out.println("Array after removing duplicates: "
                + Arrays.toString(Arrays.copyOf(arr, uniqueCount)));
    }
}