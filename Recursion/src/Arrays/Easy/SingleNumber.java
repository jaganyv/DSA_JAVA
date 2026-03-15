package Arrays.Easy;

public class SingleNumber {
    static int singleNumber(int[] arr){
        int xor = 0;
        for(int num:arr){
            xor = xor^num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,5};
        System.out.println(singleNumber(arr));
    }
}
