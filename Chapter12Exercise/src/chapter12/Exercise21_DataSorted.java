package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise21_DataSorted {
	public static void main(String[] args) throws IOException {
		String filename = "D:\\test\\SortedString.txt";

		// Create new File object
		File file = new File(filename);

		if (!file.exists()) {
			System.out.println(filename + " file does not exist");
			System.exit(1);
		}

		try (Scanner input = new Scanner(file)) {
			String s = "";

			while (input.hasNext()) {
				String s1 = input.nextLine();
				if (s.compareTo(s1) > 0) {
					System.out.println("The first two out of order");
					System.out.println("First string: " + s);
					System.out.println("Second string: " + s1);
					return;
				} else
					s = s1;
			}
			System.out.println("Strings are sorted in increasing order");
		}
	}
}
