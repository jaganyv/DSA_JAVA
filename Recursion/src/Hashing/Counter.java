package Hashing;

import java.util.HashMap;

public class Counter {
    public static void main(String[] args) {
        String s = "leetcode";
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
}
