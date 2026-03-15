package BitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int ans = convertToDecimal("1101");
        System.out.println(ans);
    }

    static int convertToDecimal(String x) {
        int len = x.length();
        int p2 = 1;
        int num = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (x.charAt(i) == '1') {
                num = num + p2;
            }
            p2 = p2 * 2;   // MUST move outside the if
        }

        return num;
    }
}
