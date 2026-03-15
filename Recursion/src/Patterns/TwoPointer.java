package Patterns;

public class TwoPointer {
            static boolean twoPointerExample(int[] arr) {
                int left = 0;
                int right = arr.length - 1;

                while (left < right) {

                    // 👉 Condition check (problem-specific)
                    if (arr[left] + arr[right] == 10) {
                        return true;
                    }

                    // 👉 Pointer movement logic
                    if (arr[left] + arr[right] < 10) {
                        left++;      // move left forward
                    } else {
                        right--;     // move right backward
                    }
                }

                return false;
            }
    public static void main(String[] args) {
        int[] arr = {5,5,20,30,40,50,60,70};
        boolean ans = twoPointerExample(arr);
        System.out.println(ans);

    }
}

