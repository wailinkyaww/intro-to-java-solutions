package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise11_RemoveText {
public static void main(String[] args) throws Exception {
		
		File file = new File(args[1]);

		if (!file.exists()) {
			System.out.println("file does not exist");
			System.exit(1);
		}

		StringBuilder s = new StringBuilder();

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = input.nextLine();
				s.append(line.replaceAll(args[0], "") + "\n");
			}
		}

		PrintWriter output = new PrintWriter(file);
		output.print(s.toString());
		output.close();
	}
}
