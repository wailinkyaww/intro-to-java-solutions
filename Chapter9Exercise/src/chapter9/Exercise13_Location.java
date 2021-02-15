package chapter9;

import java.util.Scanner;

public class Exercise13_Location {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Prompt user to enter the number of rows and columns
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] values = new double[row][column];

		receiveInput(values);

		Location location = Location.locateLargest(values);

		System.out.println("The location of the largest element " + location.maxValue + " is (" + location.row + ", "
				+ location.column + ")");
	}

	public static void receiveInput(double[][] x) {
		System.out.println("Enter the array: ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++)
				x[i][j] = input.nextDouble();
		}
	}
}

class Location {
	public int row, column;
	public double maxValue;

	public Location(double maxValue, int row, int column) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public static Location locateLargest(double[][] a) {
		double max = a[0][0];
		int row = 0, column = 0;

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				if (max < a[i][k]) {
					max = a[i][k];
					row = i;
					column = k;
				}
			}
		}

		return new Location(max, row, column);
	}
}
