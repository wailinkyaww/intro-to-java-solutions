package chapter5;

import java.util.Scanner;

public class ComputeUppercaseLetters {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int countUppercase = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i)))
				countUppercase++;
		}

		System.out.println("The number of uppercase letters is " + countUppercase);
	}
}
