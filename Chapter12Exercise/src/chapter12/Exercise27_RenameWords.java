package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise27_RenameWords {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\test\\exe");

		if (!dir.exists()) {
			System.out.println("Directory does not exist");
			System.exit(1);
		}

		File[] files = dir.listFiles();

		for (File file : files) {
			prependZeroBeforeDigit(file);
		}
	}

	public static void prependZeroBeforeDigit(File file) throws IOException {

		StringBuilder s = new StringBuilder();

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] tokens = line.split("\\s");

				for (String token : tokens) {
					if (token.matches("Exercise[\\d]+_[\\d]+")) {
						StringBuilder replaceText = new StringBuilder();
						String[] pieces = token.split("_");
						replaceText.append(pieces[0]);

						if (pieces[0].matches("[\\D]*[\\d{1}]"))
							replaceText.insert(pieces[0].length() - 1, '0');
						replaceText.append('_');

						if (pieces[1].matches("[\\d{1}]"))
							replaceText.append('0' + pieces[1]);
						else
							replaceText.append(pieces[1]);
						s.append(replaceText + " ");
						continue;
					}
					s.append(token + " ");
				}
				s.append("\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.print(s);
		output.close();
	}
}
