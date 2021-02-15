package chapter8;

import java.util.Scanner;

public class Exercise35_LargestBlock {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows in the matrix: ");
		int size = input.nextInt();

		int[][] matrix = new int[size][size];

		System.out.println("Enter the matrix row by row: ");
		getMatrix(matrix, input);
	}

	public static void getMatrix(int[][] matrix, Scanner input) {
		for (int i = 0, rowLength = matrix.length; i < rowLength; i++)
			for (int j = 0, colLength = matrix[i].length; j < colLength; j++)
				matrix[i][j] = input.nextInt();
	}
	
//	public static int[] findLargestBlock(int[][] matrix)
//	{
//		
//	}
}
