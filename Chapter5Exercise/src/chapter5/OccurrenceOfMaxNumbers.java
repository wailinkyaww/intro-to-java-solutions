package chapter5;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter numbers
		System.out.print("Enter numbers: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;

		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max)
				count++;
		}

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}
}
