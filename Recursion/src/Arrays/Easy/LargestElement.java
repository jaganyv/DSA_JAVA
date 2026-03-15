package Arrays.Easy;

public class LargestElement {
    static int largestElement(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,90,90,90};
        System.out.println(largestElement(arr));
    }
}
