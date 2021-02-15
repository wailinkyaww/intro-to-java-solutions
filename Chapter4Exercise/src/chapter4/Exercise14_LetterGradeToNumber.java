package chapter4;

import java.util.Scanner;

public class Exercise14_LetterGradeToNumber {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a letter grade
		System.out.print("Enter a letter grade: ");
		String letterGrade = input.next();

		if (letterGrade.length() != 1) {
			System.out.print("You must enter exactly one letter");
			System.exit(1);
		}

		char ch = letterGrade.charAt(0);

		// Display results
		switch (ch) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
			System.out.println("The numeric value for grade " + ch + " is " + ('A' - ch + 4));
			break;
		case 'F':
			System.out.println("The numeric value for grade " + ch + " is " + ('A' - ch + 5));
			break;
		default:
			System.out.print(ch + " is an invalid grade");
			break;
		}

	}
}
