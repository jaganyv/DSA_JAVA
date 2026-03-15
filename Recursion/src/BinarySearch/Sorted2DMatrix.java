package BinarySearch;

public class Sorted2DMatrix {
    public static void main(String[] args) {
                int[][] matrix = {
                        {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60},
                        {64,74,84,90}
                };

                int target = 90;

                boolean result = searchMatrix(matrix, target);
                System.out.println(result); // true
            }

            public static boolean searchMatrix(int[][] matrix, int target) {

                int rows = matrix.length;
                int cols = matrix[0].length;

                int low = 0;
                int high = rows * cols - 1;

                while (low <= high) {

                    int mid = low + (high - low) / 2;

                    int r = mid / cols;
                    int c = mid % cols;

                    if (matrix[r][c] == target) {
                        return true;
                    } else if (matrix[r][c] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                return false;
            }
        }

