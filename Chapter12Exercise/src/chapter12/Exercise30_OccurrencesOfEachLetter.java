package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise30_OccurrencesOfEachLetter {
	private static int counts[] = new int[26];

	public static void main(String[] args) throws IOException {
		Scanner consoleInput = new Scanner(System.in);

		// Prompt user to enter file name
		System.out.print("Enter a filename: ");
		String filename = consoleInput.nextLine();

		// Create new File object
		File file = new File(filename);

		if (!file.exists()) {
			System.out.println(filename + " does not exist");
			System.exit(1);
		}

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				for (char ch : line.toCharArray()) {
					if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
						counts[Character.toUpperCase(ch) - 'A']++;
				}
			}
		}

		for (int i = 0; i < counts.length; i++) {
			if(counts[i] <= 0) continue;
			System.out.println("Number of " + (char) ('A' + i) + "'s: " + counts[i]);
		}
	}
}
