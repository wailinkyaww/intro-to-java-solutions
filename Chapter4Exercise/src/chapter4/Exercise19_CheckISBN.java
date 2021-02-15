package chapter4;

import java.util.Scanner;

public class Exercise19_CheckISBN {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter first 9-digits
		System.out.print("Enter the first 9 digits of an ISBN as string: ");
		String digits = input.next();

		if (digits.length() != 9) {
			System.out.println("You must enter exactly 9 digits.");
			System.exit(1);
		} 

		int sum = 0;

		sum += (digits.charAt(0) - 48) * 1;
		sum += (digits.charAt(1) - 48) * 2;
		sum += (digits.charAt(2) - 48) * 3;
		sum += (digits.charAt(3) - 48) * 4;
		sum += (digits.charAt(4) - 48) * 5;
		sum += (digits.charAt(5) - 48) * 6;
		sum += (digits.charAt(6) - 48) * 7;
		sum += (digits.charAt(7) - 48) * 8;
		sum += (digits.charAt(8) - 48) * 9;

		
		// Display result
		if (sum % 11 != 10)
			System.out.println("The ISBN-10 number is " + digits + "" + sum % 11);
		else
			System.out.println("The ISBN-10 number is " + digits + "X");
	}
}
