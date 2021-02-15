package chapter7;

import java.util.Scanner;

public class Exercise20_ReviseSelectionSort {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }

        selectionSort(list);

        // Display results
        System.out.println("Sorted Numbers are: ");
        display(list);
    }

    public static void display(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void selectionSort(int[] list) {
        int lastIndex = list.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            int currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
