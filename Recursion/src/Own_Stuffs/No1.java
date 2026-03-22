package Own_Stuffs;

import java.util.Arrays;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number to store on Array: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter an elements: ");
        for(int i=0;i<num;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
