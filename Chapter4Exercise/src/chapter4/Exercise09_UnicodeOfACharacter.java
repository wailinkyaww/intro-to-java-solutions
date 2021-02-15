package chapter4;

import java.util.Scanner;

public class Exercise09_UnicodeOfACharacter {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a character
		System.out.print("Enter a character: ");
		String ch = input.next();

		// Display results
		if (ch.length() != 1)
			System.out.println("The input is invalid");
		else
			System.out.println("The Unicode character for " + ch + " is " + (int)ch.charAt(0));

	}
}
