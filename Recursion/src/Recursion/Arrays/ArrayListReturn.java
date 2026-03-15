package Recursion.Arrays;

import java.util.ArrayList;

public class ArrayListReturn {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7,7};
        int target = 2;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAll(arr,target,0,list);
        ArrayList<Integer> result = findAllIndex(arr,target,0);
        System.out.println(result);
    }
    static ArrayList<Integer> findAll(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr,target,index+1,list);
    }
    //Another way doing this above question
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answer =  findAllIndex(arr,target,index+1);
        list.addAll(answer);
        return list;
    }
}
