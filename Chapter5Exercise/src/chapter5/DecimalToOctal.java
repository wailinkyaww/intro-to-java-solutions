package chapter5;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a decimal number
		System.out.print("Enter a decimal number: ");
		int number = input.nextInt();

		String octalString = "";

		while (number != 0) {
			octalString = number % 8 + octalString;
			number /= 8;
		}

		System.out.println("The octal equivalent is " + octalString);
	}
}
