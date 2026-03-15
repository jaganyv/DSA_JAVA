package Patterns;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        /*
        number → key
        count  → value
         */
        int[] arr = {3,2,4,5,2,3,2,4,6};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
