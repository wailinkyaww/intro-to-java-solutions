package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise18_AddPackageStatement {
	public static void main(String[] args) throws IOException {
		// Get from argument
		String srcRootDirectory = args[0];

		// Create new File object
		File srcRoot = new File(srcRootDirectory);

		if (!srcRoot.isDirectory()) {
			System.out.println(srcRootDirectory + " is not a directory");
			System.exit(1);
		}

		File[] dirs = srcRoot.listFiles();

		separateFolders(dirs);
	}

	// Separate folders such as chapter1, chapter2
	public static void separateFolders(File[] dirs) throws IOException {
		for (int i = 0; i < dirs.length; i++) {
			if (!dirs[i].isDirectory())
				continue;

			// Check folder name
			if (dirs[i].getName().matches("chapter[\\d]")) {

				File[] files = dirs[i].listFiles();
				for (File file : files) {
					// Check file is java file or not
					if (file.getName().matches(".*.java"))
						writeData(file, "package chapter" + (i + 1) + "; \n");
				}
			}
		}
	}

	// Prepend data into each file
	public static void writeData(File file, String str) throws IOException {
		StringBuilder s = new StringBuilder();
		s.append(str);

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String line = input.nextLine();
				s.append(line + "\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.print(s);
		output.close();
	}
}
