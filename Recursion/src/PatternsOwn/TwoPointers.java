package PatternsOwn;

import java.util.Arrays;

public class TwoPointers {
    static int[] twoPointer(int[] arr,int target){
        int left = 0 , right = arr.length-1;
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
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 10;
        int ans[] = twoPointer(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
