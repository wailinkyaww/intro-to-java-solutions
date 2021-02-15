package chapter4;

import java.util.Scanner;

public class Exercise15_PhoneKeyPads {
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

		char ch = letter.charAt(0);
		int number = 0;

		switch (Character.toUpperCase(ch)) {
		case 'A':
		case 'B':
		case 'C':
			number = 2;
			break;
		case 'D':
		case 'E':
		case 'F':
			number = 3;
			break;
		case 'G':
		case 'H':
		case 'I':
			number = 4;
			break;
		case 'J':
		case 'K':
		case 'L':
			number = 5;
			break;
		case 'M':
		case 'N':
		case 'O':
			number = 6;
			break;
		case 'P':
		case 'Q':
		case 'R':
			number = 7;
			break;
		case 'S':
		case 'T':
		case 'U':
			number = 8;
			break;
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			number = 9;
			break;
		default:
			System.out.println(ch + " is an invalid input");
			System.exit(1);
			break;
		}

		// Display result
		System.out.println("The corresponding number is " + number);

	}
}
