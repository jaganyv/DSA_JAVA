package Hashing;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num: map.keySet()){
            System.out.println(num + " -> " + map.get(num));
        }
    }
}
