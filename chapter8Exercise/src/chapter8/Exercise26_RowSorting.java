package chapter8;

import java.util.Scanner;

public class Exercise26_RowSorting {
	public static void main(String[] args) {
		double[][] m = new double[3][3];

		// Prompt user to enter 3x3 matrix
		System.out.println("Enter a 3-by-3 matrix row by row");
		getArray(m);
		
		// Display results
		System.out.println("The row sorted array is: ");
		display(sortRows(m));
	}

	public static void getArray(double[][] m) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
	}

	public static void display(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {
		double[][] n = new double[m.length][m[0].length];

		// Copy array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++)
				n[i][j] = m[i][j];
		}

		// Sort rows
		for (int i = 0; i < n.length;)
			sort(n[i++]);

		return n;
	}

	// Sort individual row
	public static void sort(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			double currentMin = arr[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (currentMin > arr[j]) {
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				arr[currentMinIndex] = arr[i];
				arr[i] = currentMin;
			}
		}
	}
}
