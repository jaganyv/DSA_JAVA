package BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 10;  // binary: 1010
        int i = 2;

        int result = n | (1 << i);
        System.out.println(result);
    }
}