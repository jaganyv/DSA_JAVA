package Arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    static void rotateArray(int[] arr,int k){
    int n = arr.length;
    if(n==0) return;
    if(k==0) return;
    k = k % n;
    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            arr[l] = arr[l]^arr[r];
            arr[r] = arr[l]^arr[r];
            arr[l] = arr[l]^arr[r];
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
