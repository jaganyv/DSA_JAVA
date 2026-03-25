package Own_Stuffs;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "malayalam";
        String rev = "";

        for(int i=name.length()-1;i>=0;i--){
            rev +=  name.charAt(i);
        }
        System.out.println(rev);

        if(rev.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

        StringBuilder sb = new StringBuilder(new StringBuilder(name).reverse().toString());
        System.out.println(name.equals(sb));

        int count = 0;
        for(int num : name.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
