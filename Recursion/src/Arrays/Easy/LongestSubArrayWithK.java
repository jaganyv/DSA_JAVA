package Arrays.Easy;

public class LongestSubArrayWithK {
    static int longestSub(int[] arr,int k){
        int n = arr.length;
        int maxLength = 0;
        for(int startIndex = 0;startIndex<n;startIndex++){
            for(int endIndex = startIndex;endIndex<n;endIndex++){
                int currentSum = 0;
                for(int i=startIndex;i<=endIndex;i++){
                    currentSum+=arr[i];
                }
                if(currentSum==k){
                    maxLength = Math.max(maxLength,endIndex-startIndex+1);
                }

            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
    int[] arr = {10,9,8,7,6,4,3,2,31};
    int k = 15;
    System.out.println(longestSub(arr,k));
    }
}
