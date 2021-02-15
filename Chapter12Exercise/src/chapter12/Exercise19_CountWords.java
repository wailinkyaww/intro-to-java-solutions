package chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise19_CountWords {
	public static void main(String[] args) {
		String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		int wordCount = 0;

		try {
			URL url = new URL(URLString);
			Scanner input = new Scanner(url.openStream());

			while (input.hasNext()) {
				String line = input.nextLine();
				wordCount += line.split("\\s").length;
			}

			System.out.println("The number of words " + wordCount);

		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
