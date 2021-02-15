package chapter6;

import java.util.Scanner;

public class CountTheLettersInAString {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		System.out.println("The number of letters in \"" + s + "\" is " + countLetters(s));
	}

	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				count++;
		}
		return count;
	}
}
