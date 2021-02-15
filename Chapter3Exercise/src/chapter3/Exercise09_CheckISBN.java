package chapter3;

import java.util.Scanner;

public class Exercise09_CheckISBN {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter first 9-digits
		System.out.print("Enter the first nine digit of an ISBN as integer: ");
		int number = input.nextInt();
		int remainingValue = number;
		int sum = 0;

		sum += (remainingValue % 10) * 9;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 8;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 7;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 6;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 5;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 4;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 3;
		remainingValue = remainingValue / 10;

		sum += (remainingValue % 10) * 2;
		remainingValue = remainingValue / 10;

		if (sum % 11 == 10)
			System.out.println("The ISBN-10 number is 0" + number + "X");
		else
			System.out.println("The ISBN-10 number is 0" + number + "" + sum % 11);
	}
}
