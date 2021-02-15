package chapter7;

import java.util.Scanner;

public class Exercise18_BubbleSort {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		double[] numbers = new double[10];

		// Prompt user to enter ten numbers
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		// Sort the numbers with bubble sort
		bubbleSort(numbers);

		// Display results
		System.out.println("Sorted numbers: ");
		printSortedArray(numbers);
	}

	public static void printSortedArray(double[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static void bubbleSort(double[] x) {
		double temp = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 1; j < x.length - i; j++) {
				if (x[j] < x[j - 1]) {
					temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
	}
}
