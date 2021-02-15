package chapter8;

import java.util.Scanner;

public class Exercise13_LocateLargestElement {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter rows and columns of the matrix
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] matrix = new double[row][column];
		
		// Prompt user to enter the array
		System.out.println("Enter the array: ");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}
		
		int[] location = locateLargest(matrix);
		System.out.println("The location of the largest element is (" + location[0] + ", " + location[1] + ")");
	}
	
	public static int[] locateLargest(double[][] a) {
		int[] location = new int[2];
		location[0] = 0;
		location[1] = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[location[0]][location[1]] < a[i][j]) {
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}
}