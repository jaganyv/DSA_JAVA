package PatternsPrinting;

public class Pattern13 {
    public static void pattern13(int n) {
        for(int i=0;i<n;i++){
          char ch = (char) ('A' + i);
          for(int j=0;j<=i;j++){
              System.out.print(ch + " ");
          }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern13(5);
    }
}
