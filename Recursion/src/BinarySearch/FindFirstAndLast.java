package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLast {
    static int firstOccurence(int[] nums,int target){
        int low = 0 , high = nums.length-1,ans = -1;
        while(low<=high){
            int mid = high + (low-high)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid -1 ;
            }else if(nums[mid]<target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int secondOccurence(int[] nums,int target){
        int low = 0 , high = nums.length-1,ans = -1;
        while(low<=high){
            int mid = high + (low-high)/2;
            if(nums[mid]==target){
                ans = mid;
                low = low + 1;
            }else if(nums[mid]<target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int[] answer(int[] nums, int target){
        int first = firstOccurence(nums,target);
        int second = secondOccurence(nums,target);
        return new int[]{first,second};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(answer(nums,target)));
    }
}
