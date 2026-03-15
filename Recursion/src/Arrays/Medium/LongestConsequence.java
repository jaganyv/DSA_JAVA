package Arrays.Medium;

public class LongestConsequence {
    static boolean linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    static int longestSequ(int[] arr){
        if(arr.length == 0) return 0;
        int n = arr.length;
        int longest = 1;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr,x+1)==true){
                x+=1;
                count=count+1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int ans = longestSequ(arr);
        System.out.println(ans);
    }
}
