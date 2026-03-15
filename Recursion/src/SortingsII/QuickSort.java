package SortingsII;

public class QuickSort {
    static void partition(int[] arr,int low,int high){
        if(low<high){
            int pivot = quickSort(arr,low,high);
            partition(arr,low,pivot-1);
            partition(arr,pivot+1,high);
        }
    }
    static int quickSort(int[] arr,int low,int high){
        int pivotIndex = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivotIndex){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        partition(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
