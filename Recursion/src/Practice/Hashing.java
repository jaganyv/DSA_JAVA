package Practice;


import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();

        // input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute hash (frequency array)
        int[] hash = new int[13]; // assuming numbers are in range 0–12
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();

            // fetch frequency
            System.out.println(hash[number]);
        }

        sc.close();
    }
}

