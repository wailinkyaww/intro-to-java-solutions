package chapter7;

import java.util.Scanner;

public class Exercise28_Combinations {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int n = 10;
        int[] numbers = new int[n];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < n; )
            numbers[i++] = input.nextInt();

        printCombinations(numbers);
    }

    public static void printCombinations(int[] list) {
        for (int i = 0, length = list.length; i < length; i++) {
            for (int j = i + 1; j < length; )
                System.out.print(list[i] + " " + list[j++] + "\t\t");
            System.out.println();
        }
    }

}
