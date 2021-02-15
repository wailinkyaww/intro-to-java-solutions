package chapter7;

import java.util.Scanner;

public class Exercise34_SortCharactersInAString {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		System.out.println(sort(s));
	}

	public static String sort(String s) {
		char[] chars = new char[s.length()];
		String sorted = "";

		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}

		for (int i = 0; i < chars.length; i++) {
			for (int j = 1; j < chars.length - i; j++) {
				if (chars[j - 1] > chars[j]) {
					char temp = chars[j - 1];
					chars[j - 1] = chars[j];
					chars[j] = temp;
				}
			}
		}

		for (int i = 0; i < chars.length; i++) {
			sorted += chars[i];
		}

		return sorted;
	}
}
