package chapter5;

import java.util.Scanner;

public class ProcessString {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.print("Enter a string: ");
		String text = input.nextLine();

		String charsAtOddPositions = "";

		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0)
				charsAtOddPositions += text.charAt(i);
		}

		System.out.println(charsAtOddPositions);
	}
}
