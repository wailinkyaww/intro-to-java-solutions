package chapter5;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		int vowelsCount = 0;

		for (int i = 0; i < text.length(); i++) {
			switch (text.charAt(i)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsCount++;
				break;
			}
		}

		System.out.println("The number of vowels is " + vowelsCount);
		System.out.println("The number of consonants is " + (text.length() - vowelsCount));
	}
}
