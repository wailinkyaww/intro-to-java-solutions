package chapter10;

import java.util.Scanner;

public class PalindromeNonAlphanumeric {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		// Display result
		System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrom? " + isPalindrom(s));
	}

	public static boolean isPalindrom(String s) {
		// Create a new string by eliminating nonalphanumeric characters
		String s1 = filter(s);

		// Create a new string that is reversal of s1
		String s2 = reverse(s1);

		// Check if the reversal is same as the original string
		return s2.equals(s1);
	}

	public static String filter(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i)))
				stringBuilder.append(s.charAt(i));
		}
		return stringBuilder.toString();
	}

	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
