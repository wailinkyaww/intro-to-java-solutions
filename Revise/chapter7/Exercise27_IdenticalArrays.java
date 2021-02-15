package chapter7;

import java.util.Scanner;

public class Exercise27_IdenticalArrays {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int n = input.nextInt();

        int[] list1 = new int[n];
        for (int i = 0; i < n; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        n = input.nextInt();

        int[] list2 = new int[n];
        for (int i = 0; i < n; i++)
            list2[i] = input.nextInt();

        if (equals(list1, list2))
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) return false;

        // Sort list1 and list2
        sort(list1);
        sort(list2);

        return strictlyIdentical(list1, list2);
    }

    public static boolean strictlyIdentical(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i]) return false;
        return true;
    }

    public static void sort(int[] list) {
        for (int i = 0, length = list.length; i < length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
