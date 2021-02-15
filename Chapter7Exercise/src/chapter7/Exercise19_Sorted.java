package chapter7;

import java.util.Scanner;

public class Exercise19_Sorted {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list: ");
		int n = input.nextInt();

		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		if (isSorted(numbers))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length  - 1;) {
			if (list[i] > list[++i])
				return false;
		}
		return true;
	}
}
