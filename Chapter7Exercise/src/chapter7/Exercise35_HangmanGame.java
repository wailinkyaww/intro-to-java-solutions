package chapter7;

import java.util.Scanner;

public class Exercise35_HangmanGame {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		String[] words = { "write", "that", "program", "read", "code" };

		do {
			String word = words[(int) (Math.random() * words.length)];
			
			for (int i = 0; i < words.length; i++) {
				System.out.println("(Guess) Enter a letter in word");
			}
			
		} while (input.nextLine().charAt(0) == 'y');
	}
}
