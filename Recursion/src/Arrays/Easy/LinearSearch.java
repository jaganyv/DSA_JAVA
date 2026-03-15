package Arrays.Easy;

public class LinearSearch {
    static int linearSearch(int[] arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 50;
        int ans = linearSearch(arr,target);
        System.out.println("Target Element is Found at index: " + ans);
    }
}
