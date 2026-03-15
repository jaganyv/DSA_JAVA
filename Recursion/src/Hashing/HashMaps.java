package Hashing;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        HashMap<Integer, Integer> key = new HashMap<>();
        key.put(10,1);
        key.put(20,2);
        key.put(30,3);
        key.put(30,3);
        int value = key.get(10);
        System.out.println(value);
        if(key.containsKey(30)){
            System.out.println(key.get(30));
        }
        int ans = key.getOrDefault(40,0);
        int remove = key.remove(10);
        System.out.println(remove);
        System.out.println(ans);
    }
}
