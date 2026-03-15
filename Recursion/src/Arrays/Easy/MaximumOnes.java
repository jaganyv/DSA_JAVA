package Arrays.Easy;

public class MaximumOnes {
    static int maxiCons(int[] arr){
        int normalCount = 0;
        int maxCount = 0;
        for(int num:arr){
            if(num==1){
                normalCount++;
                maxCount = Math.max(normalCount,maxCount);
            }else{
                normalCount=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        System.out.println(maxiCons(arr));
    }
}
