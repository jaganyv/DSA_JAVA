package Arrays.Easy;

import java.util.Arrays;

public class MoveZeros {
    static void moveZeros(int[] arr){
        int sortedZeros = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[sortedZeros] = arr[i];
                sortedZeros++;
            }
        }
        while(sortedZeros<n){
            arr[sortedZeros] = 0;
            sortedZeros++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,0,12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
