package StringsBasics;

public class BasicString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(1,4));

        char[] arr = s.toCharArray();

        for(char num:arr){
            System.out.print(num + " ");
        }
    }
}
