package Patterns.TwoPointers;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int target = 10;
    System.out.println(Arrays.toString(twoSum2(arr,target)));
    }
    //It is an One Indexed Array Not A Zero Indexed Array
    static int[] twoSum2(int[] arr,int target){
        int left = 0 , right = arr.length - 1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
