package Patterns;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(hasDuplicate(arr));
    }

    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
