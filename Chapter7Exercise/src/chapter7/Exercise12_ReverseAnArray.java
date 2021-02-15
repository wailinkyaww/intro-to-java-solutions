package chapter7;

import java.util.Scanner;

public class Exercise12_ReverseAnArray {
	public static void main(String[] args) {
		// Create a SCanner
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];

		// Prompt user to enter ten numbers
		System.out.print("Enter ten integers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("The number is reversed order: ");
		displayArray(reverse(numbers));
	}

	public static int[] reverse(int[] x) {
		int temp = 0;

		for (int i = 0; i < x.length / 2; i++) {
			temp = x[x.length - 1 - i];
			x[x.length - 1 - i] = x[i];
			x[i] = temp;
		}

		return x;
	}

	public static void displayArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
