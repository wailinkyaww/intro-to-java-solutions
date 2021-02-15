package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise09_LargestRowsAndColumns {
	public static void main(String[] args) {
		LargestRowsAndColumns.main(args);
	}
}

class LargestRowsAndColumns {
	private static ArrayList<Integer> rows = new ArrayList<>();
	private static ArrayList<Integer> columns = new ArrayList<>();

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int n = input.nextInt();

		int[][] matrix = new int[n][n];

		fillRandomsToArray(matrix);
		displayIntegerArray(matrix);
		countOnesInColumn(matrix);

		System.out.println("The largest row index: " + rows.indexOf(Collections.max(rows)));
		System.out.println("The largest column index: " + columns.indexOf(Collections.max(columns)));

	}

	private static void countOnesInColumn(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			int count = 0;
			for (int row = 0; row < arr.length; row++) {
				if (arr[row][col] == 1)
					count++;
			}
			columns.add(count);
		}
	}

	private static void fillRandomsToArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int countOnesInRow = 0;
			for (int j = 0; j < arr[i].length; j++) {
				int x = (int) (Math.random() * 2);
				if (x == 1)
					countOnesInRow++;
				arr[i][j] = x;
			}
			rows.add(countOnesInRow);
		}
	}

	private static void displayIntegerArray(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				System.out.print(x[i][j]);
			System.out.println();
		}
	}
}
