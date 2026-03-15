package PatternsPrinting;

public class Pattern11 {
    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 10;
        pattern11(n);
    }
}
