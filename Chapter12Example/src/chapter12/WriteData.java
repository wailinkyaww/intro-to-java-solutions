package chapter12;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws Exception {
		File file = new File("score.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}

		// Create a file
		PrintWriter output = new PrintWriter(file);

		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);

		// Close the file
		output.close();
	}
}
