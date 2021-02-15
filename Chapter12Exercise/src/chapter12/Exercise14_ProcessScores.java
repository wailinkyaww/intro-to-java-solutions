package chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise14_ProcessScores {
	public static void main(String[] args) throws IOException {
		double sum = 0, average = 0, count = 0;
		String filename = args[0];

		// Create new File
		File file = new File(filename);

		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				double value = input.nextDouble();
				sum += value;
				count++;
			}

			average = sum / count;
			System.out.println("The total is " + sum);
			System.out.print("The average is " + average);
		} 
	}
}
