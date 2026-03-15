package Arrays.Easy;

public class sLargestElement {
    static int secondLargest(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
        int[] arr = {10,10,10,10,10,10};
        System.out.println(secondLargest(arr));
    }
}
