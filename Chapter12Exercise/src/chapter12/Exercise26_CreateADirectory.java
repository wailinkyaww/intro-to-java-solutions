package chapter12;

import java.io.File;
import java.util.Scanner;

public class Exercise26_CreateADirectory {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a directory name
		System.out.print("Enter a directory name: ");
		String pathname = input.nextLine();

		// Create a new File object
		File file = new File(pathname);

		if (file.exists()) {
			System.out.println("Directory already exist");
			System.exit(1);
		}

		if (file.mkdirs())
			System.out.println("Directory created successfully");
	}
}
