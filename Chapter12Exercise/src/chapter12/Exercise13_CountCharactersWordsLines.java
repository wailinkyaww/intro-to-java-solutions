package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise13_CountCharactersWordsLines {
	public static void main(String[] args) throws Exception {
		int chars = 0, words = 0, lines = 0;
		String filename = args[0];

		// Create a File object
		File file = new File(filename);

		StringBuilder s = new StringBuilder();
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String value = input.nextLine();

				// \s represent white-space character
				words += value.split("\\s").length;
				chars += value.length();
				lines++;
			}

			System.out.println(filename + " has ");
			System.out.println(chars + " characters");
			System.out.println(words + " words");
			System.out.println(lines + " lines");

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
