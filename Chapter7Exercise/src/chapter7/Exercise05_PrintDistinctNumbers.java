package chapter7;

import java.util.Scanner;

public class Exercise05_PrintDistinctNumbers {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[10];

		// Prompt user to enter ten integers
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			int n = input.nextInt();
			if (isExit(numbers, i, n) < 0)
				numbers[i] = n;
		}

		int distinct = countDistinctNumber(numbers);

		System.out.println("The number of distinct number is " + distinct);

		displayArray(numbers);
	}

	public static int countDistinctNumber(int[] list) {
		int i = 0;
		for (i = 0; i < list.length; i++) {
			if (list[i] == 0)
				break;
		}

		return i;
	}

	public static void displayArray(int[] arr) {
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
	}

	public static int isExit(int[] arr, int length, int key) {
		for (int i = 0; i < length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}
}
