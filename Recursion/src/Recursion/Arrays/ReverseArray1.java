package Recursion.Arrays;

import java.util.Scanner;

public class ReverseArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter a element: ");
        for(int i=0;i<num;i++){
            arr[i] = scanner.nextInt();
        }
        reverseArray(arr,0,num-1);
        System.out.println("Reversed Array: ");
        for(int x:arr){
            System.out.println(x);
        }
    }
    static void reverseArray(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right] = temp;

        reverseArray(arr,left+1,right-1);
    }
}
