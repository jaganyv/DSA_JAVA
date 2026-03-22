package Tcs;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of entries

        int[] days = new int[n];
        int[] hours = new int[n];

        for(int i = 0; i < n; i++) {
            days[i] = sc.nextInt();
            hours[i] = sc.nextInt();
        }

        // Selection Sort
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {

                if(days[j] < days[minIndex] ||
                        (days[j] == days[minIndex] && hours[j] < hours[minIndex])) {
                    minIndex = j;
                }
            }

            // Swap days
            int tempDay = days[i];
            days[i] = days[minIndex];
            days[minIndex] = tempDay;

            // Swap hours
            int tempHour = hours[i];
            hours[i] = hours[minIndex];
            hours[minIndex] = tempHour;
        }

        // Output
        for(int i = 0; i < n; i++) {
            System.out.println(days[i] + " " + hours[i]);
        }
    }
}
