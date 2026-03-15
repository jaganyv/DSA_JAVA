package SortingsII;

public class RecursiveBubble {
    static void rBubbleSort(int[] arr,int n){
        if(n==1) return;

        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        rBubbleSort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        System.out.println("Before Recursive bubble sort: ");
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        rBubbleSort(arr,n);
        System.out.println("After Recursive bubble Sort: ");
        for(int j:arr){
            System.out.print(j+ " ");
        }
    }
}
