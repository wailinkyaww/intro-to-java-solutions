package chapter4;

import java.util.Scanner;

public class Exercise20_ProcessAString {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		// Display length and first character
		System.out.println("The length of the string is " + text.length());
		System.out.println("The first character of the string is '" + text.charAt(0) + "'");
	}
}
