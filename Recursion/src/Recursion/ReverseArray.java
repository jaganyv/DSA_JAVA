package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an number: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        reverse(arr,0,n-1);
        System.out.println("Reversed Array: ");
        for(int x: arr){
            System.out.println(x+" ");
        }

    }
}
