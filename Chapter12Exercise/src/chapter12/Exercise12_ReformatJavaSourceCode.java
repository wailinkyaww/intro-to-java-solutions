package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_ReformatJavaSourceCode {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_ReformatJavaSourceCode file");
			System.exit(1);
		}

		File file = new File(args[0]);

		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		StringBuilder s = new StringBuilder();
		String st1 = new String();
		String st2 = new String();

		try (Scanner input = new Scanner(file);) {
			st1 = input.nextLine();
			while (input.hasNext()) {
				st2 = input.nextLine();
				if (st2.length() > 0 && st2.charAt(st2.length() - 1) == '{') {
					s.append(st2.concat(" {"));
					st1 = input.nextLine();
				} else {
					s.append(st1);
					st1 = st2;
				}
			}
			s.append(st1);
		}

		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 0; i < s.length(); i++) {
				output.println(s);
			}
		}
	}
}
