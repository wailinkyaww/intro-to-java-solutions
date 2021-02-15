package chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise15_WriteReadData {
	public static void main(String[] args) throws IOException {
		String filename = "Exercise12_15.txt";
		File file = new File(filename);

		if (file.exists()) {
			System.out.println(filename + " file already exist!");
			System.out.println(1);
		}

		try (PrintWriter output = new PrintWriter(file)) {
			int count = 0;
			for (; ++count <= 100;) {
				int n = (int) (Math.random() * 100);
				output.append(n + " ");
			}
		}

		int[] numbers = new int[100];

		try (Scanner input = new Scanner(file);) {
			int count = 0;
			while (input.hasNext()) {
				numbers[count++] = input.nextInt();
			}
		}
		
		sort(numbers);
		displayArray(numbers);
	}

	// Display the items in array
	public static void displayArray(int[] x) {
		for (int item : x) {
			System.out.print(item + " ");
		}
	}

	// Sort the integer array with selection sort
	public static void sort(int[] x) {
		int currentMin = x[0];
		int currentMinIndex = 0;
		for (int i = 0; i < x.length; i++) {
			currentMin = x[i];
			for (int j = i + 1; j < x.length; j++) {
				if (currentMin > x[j]) {
					currentMin = x[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				int temp = x[i];
				x[i] = currentMin;
				x[currentMinIndex] = temp;
			}
		}
	}
}
