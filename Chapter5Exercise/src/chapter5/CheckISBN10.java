package chapter5;

import java.util.Scanner;

public class CheckISBN10 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the first 9 digits
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number = input.nextInt();

		int remainingValue = number;
		int sum = 0;

		for (int i = 9; i >= 2; i--) {
			sum += (remainingValue % 10) * i;
			remainingValue = remainingValue / 10;
		}
		
		if (sum % 11 == 10)
			System.out.println("The ISBN-10 number is 0" + number + "X");
		else
			System.out.println("The ISBN-10 number is 0" + number + "" + sum % 11);
	}
}
