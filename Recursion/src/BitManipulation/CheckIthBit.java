package BitManipulation;

public class CheckIthBit {
    public static void main(String[] args) {
        int n = 13; // binary: 1101
        int i = 1;

        if ((n & (1 << i)) != 0) {
            System.out.println("Bit is set");
        } else {
            System.out.println("Bit is not set");
        }
    }
}