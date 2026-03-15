package PatternsPrinting;

public class Pattern8 {
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern8(n);
        pattern9(n);
    }
}
