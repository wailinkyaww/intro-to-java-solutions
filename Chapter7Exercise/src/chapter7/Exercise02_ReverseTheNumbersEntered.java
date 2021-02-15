package chapter7;

import java.util.Scanner;

public class Exercise02_ReverseTheNumbersEntered {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];
		int[] reverse = new int[numbers.length];

		// Prompt user to enter ten integers
		System.out.print("Enter ten integers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		reverse = reverseOrder(numbers);

		System.out.print("Numbers in reverse order: ");
		displayArray(reverse);
	}

	public static int[] reverseOrder(int[] x) {
		int[] reverse = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			reverse[x.length - 1 - i] = x[i];
		}

		return reverse;
	}

	public static void displayArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
