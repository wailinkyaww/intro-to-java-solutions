package chapter4;

import java.util.Scanner;

public class Exercise13_VowelOrConsonant {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a letter
		System.out.print("Enter a letter: ");
		String letter = input.next();

		if (letter.length() != 1) {
			System.out.println("You must enter exactly one letter");
			System.exit(1);
		}

		// Check and display result
		char ch = letter.charAt(0);

		if (!Character.isLetter(ch)) {
			System.out.println(ch + " is an invalid input");
			System.exit(1);
		}

		switch (Character.toUpperCase(ch)) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is a consonant");
			break;
		}
	}
}
