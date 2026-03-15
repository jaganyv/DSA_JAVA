package Hashing;

import java.util.HashMap;

public class HighestOccuring {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        int element = -1;

        for(int key: map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq = map.get(key);
                element = key;
            }
        }
        System.out.println("Highest Occuring Element: " + element);
        System.out.println("Element: " + maxFreq);
    }
}
