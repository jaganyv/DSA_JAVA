package StringsBasics;

public class FrequencyCounting {
    public static void main(String[] args) {
        String s = "banana";
        int[] freq = new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        System.out.println(freq['a'-'a']);
    }
}
