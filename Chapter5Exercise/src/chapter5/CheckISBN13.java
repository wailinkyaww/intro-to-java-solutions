package chapter5;

import java.util.Scanner;

public class CheckISBN13 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the first 12 digits of an ISBN-13
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbnNumber = input.nextLine();

		if (isbnNumber.length() != 12) {
			System.out.println(isbnNumber + " is an invalid input");
			System.exit(1);
		}

		int sum = 0;
		int checksum = 0;

		for (int i = 0; i < isbnNumber.length(); i++) {
			if (isbnNumber.charAt(i) >= 48 && isbnNumber.charAt(i) <= 57) {
				if (i % 2 == 0)
					sum += isbnNumber.charAt(i) - 48;
				else
					sum += (isbnNumber.charAt(i) - 48) * 3;
			} else {
				System.out.println(isbnNumber + " is an invalid input");
				System.exit(1);
			}
		}

		checksum = 10 - sum % 10;

		if (checksum == 10)
			checksum = 0;

		// Display results
		System.out.println("The ISBN-13 number is " + isbnNumber + checksum);
	}
}
