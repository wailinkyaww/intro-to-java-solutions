package chapter6;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacter {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string follow by a character: ");
		String s = input.nextLine();

		String s1 = s.substring(0, s.length() - 2);
		char ch = s.charAt(s.length() - 1);

		System.out.println("The occurrence of the character in the string: " + count(s1, ch));
	}

	public static int count(String str, char a) {
		int c = 0; // Initialize counter

		for (int i = 0; i < str.length();) {
			if (str.charAt(i++) == a)
				c++;
		}

		return c;
	}
}
