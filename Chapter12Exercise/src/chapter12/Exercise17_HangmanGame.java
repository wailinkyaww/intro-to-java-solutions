package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise17_HangmanGame {

	private static String[] words;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String filename = "hangman.txt";

		// Create new File object
		File file = new File(filename);

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String s = input.nextLine();
				words = s.split("\\s");
			}
		}

		boolean continueGuess = true;

		do {
			// Generate random index
			int index = (int) (Math.random() * words.length);

			String word = words[index];

			HangmanGame game = new HangmanGame(word);
			game.fillAsterisks();

			while (!game.isComplete()) {
				System.out.print("(Guess) Enter a letter in word ");
				game.displayChars();

				String guess = input.next();
				game.checkGuess(guess);
			}

			System.out.println("The word is " + word + ". You miss " + game.getMissCount() + " time");

			System.out.print("Do you want to guess another word? Enter y or n > ");
			String answer = input.next();
			if (Character.toUpperCase(answer.charAt(0)) != 'Y')
				continueGuess = false;

		} while (continueGuess);

		System.out.println("End");
		System.exit(0);

	}
}

class HangmanGame {
	private String word;
	private char[] chars;
	private int missCount = 0;

	public HangmanGame(String word) {
		this.word = word;
		this.chars = new char[word.length()];
	}

	public int getMissCount() {
		return missCount;
	}

	public boolean isComplete() {
		for (char ch : chars) {
			if (ch == '*')
				return false;
		}
		return true;
	}

	public void displayChars() {
		for (char ch : chars) {
			System.out.print(ch);
		}
		System.out.print(" > ");
	}

	public void fillAsterisks() {
		for (int i = 0; i < chars.length;) {
			chars[i++] = '*';
		}
	}

	public void checkGuess(String guess) {
		boolean isContain = false;
		char ch = guess.charAt(0);
		for (int i = 0; i < chars.length; i++) {
			char letter = word.charAt(i);
			if (ch == letter) {
				if (chars[i] == ch) {
					System.out.println("\t" + ch + " is already in the word");
					return;
				}
				chars[i] = ch;
				isContain = true;
			}
		}
		if (!isContain) {
			missCount++;
			System.out.println("\t" + ch + " is not in the word");
		}
	}

}
