package SortingsII;

public class RecursiveInsertion {
    static void insertionSort(int[] arr,int i,int n){
        if(i==n) return;
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr,i+1,n);
    }

    public static void main(String[] args) {
        int[] arr = {13,10,9,8,7,6,4,3,2};
        int n = arr.length;
        System.out.println("Before Recursive Insertion sort: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("After Recursive Insertion sort:");
        insertionSort(arr,0,n);
        for(int nums:arr){
            System.out.print(nums + " ");
        }
    }
}
