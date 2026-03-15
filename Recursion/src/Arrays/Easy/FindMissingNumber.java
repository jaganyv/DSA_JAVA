package Arrays.Easy;

public class FindMissingNumber {
    static int missingNumber(int[] arr){
        int n = arr.length;
        //Direct Formula to find
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num:arr){
            actualSum += num;
        }
       return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,2};
        System.out.println(missingNumber(arr));
    }
}
