package BitManipulation;

public class Gates {
    public static void main(String[] args) {
        //AND Gate
        int x = 13 & 7;
        System.out.println(x);

        //OR Gate
        int y = 13 | 7;
        System.out.println(y);

        //XOR Gate
        int z = 13 ^ 7;
        System.out.println(z);

        //SHIFT << and >>
        int a = 13 >> 7;
        System.out.println(a);

        int b = 13 << 7;
        System.out.println(b);

        //NOT Gate
        int c = ~5;
        System.out.println(c);
    }
}
