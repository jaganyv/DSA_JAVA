package Own_Stuffs;

import java.util.Arrays;

public class TwoPointers {
    static int[] twoSum(int[] arr,int target){
        int left = 0 , right = arr.length - 1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
