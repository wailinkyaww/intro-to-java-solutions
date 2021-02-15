package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise22_ReplaceText {
	public static void main(String[] args) throws IOException {
		String dirName = args[0];
		String oldString = args[1];
		String newString = args[2];

		File dir = new File(dirName);

		if (!dir.isDirectory()) {
			System.out.println(dirName + " directory does not exit");
		}

		File[] files = dir.listFiles();

		for (File file : files) {
			replaceText(file, oldString, newString);
		}
	}

	// Replace Text for each specified file
	public static void replaceText(File file, String oldString, String newString) throws IOException {

		StringBuilder s = new StringBuilder();

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				s.append(line.replaceAll(oldString, newString) + "\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.print(s);
		output.close();
	}

}
