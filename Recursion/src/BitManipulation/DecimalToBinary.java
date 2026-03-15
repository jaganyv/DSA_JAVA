package BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        String ans = convertToBinary(13);
        System.out.println(ans);
    }
    static String convertToBinary(int x){
       String res = " ";
       String reversed = " ";
       while(x > 0){
           if(x % 2 == 1){
               res += "1";
           }else{
               res += "0";
           }
           x=x/2;
       }
       for(int i=res.length()-1;i>=0;i--){
           reversed += res.charAt(i);
       }
       return reversed;
    }
}
