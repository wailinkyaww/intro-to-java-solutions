package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise16_ReplaceText {
	public static void main(String[] args) throws IOException {
		String filename = args[0];

		// Create new file
		File file = new File(filename);

		if (!file.exists()) {
			System.out.println("Source file " + file + " does not exist!");
			System.exit(1);
		}

		StringBuilder s = new StringBuilder();

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = input.nextLine();
				s.append(line.replaceAll(args[1], args[2]) + "\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.print(s);
		output.close();
	}
}
