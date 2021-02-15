package chapter7;

import java.util.Scanner;

public class Exercise15_EliminateDuplicates {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];

		// Prompt user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int[] distinct = eliminateDuplicates(numbers);

		// Display result
		System.out.print("The distinct numbers are: ");
		displayArray(distinct);

	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] distinct = new int[list.length];
		boolean isExist = false;

		distinct[0] = list[0];

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < i; j++) {
				if (list[i] == distinct[j])
					isExist = true;
			}

			if (!isExist)
				distinct[i] = list[i];
		}

		return distinct;
	}

	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
	}
}
