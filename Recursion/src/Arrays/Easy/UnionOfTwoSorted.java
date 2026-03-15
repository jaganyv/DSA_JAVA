package Arrays.Easy;


import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSorted {
    //Brute Force
    static void findUnion(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        int[] arr2 = {1,2,2,3,4,5,5,6,7};
        findUnion(arr1,arr2);
    }
}
