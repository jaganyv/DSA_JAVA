package Patterns.PrefixSum;

public class PrefixDebugDemo {

    public static void main(String[] args) {

        int[] nums = {5, 3, 7, 1, 2};
        int n = nums.length;

        // Step 1: Build prefix array
        int[] prefix = new int[n + 1];

        System.out.println("Building Prefix Array:");

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
            System.out.println("prefix[" + (i + 1) + "] = "
                    + prefix[i + 1] + " (because "
                    + prefix[i] + " + " + nums[i] + ")");
        }

        // Step 2: Query
        int left = 1;
        int right = 3;

        int rangeSum = prefix[right + 1] - prefix[left];

        System.out.println("\nRange Sum from index " + left + " to " + right + " = " + rangeSum);
    }
}

