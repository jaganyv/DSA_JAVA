package BinarySearch;

public class Floor {

    // Function to find floor
    public int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];   // possible floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Function to find ceil
    public int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];   // possible ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Function to return floor and ceil
    public int[] getFloorAndCeil(int[] arr, int x) {
        int f = findFloor(arr, x);
        int c = findCeil(arr, x);
        return new int[]{f, c};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;

        Floor finder = new Floor();
        int[] res = finder.getFloorAndCeil(arr, x);

        System.out.println("The floor and ceil are: " + res[0] + " " + res[1]);
    }
}