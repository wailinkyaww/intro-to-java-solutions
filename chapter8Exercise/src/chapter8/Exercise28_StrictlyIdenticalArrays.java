package chapter8;

import java.util.Scanner;

public class Exercise28_StrictlyIdenticalArrays {
	public static void main(String[] args) {
		// Create two matrix
		int[][] m1 = new int[3][3], m2 = new int[3][3];

		// Prompt user to enter two list
		System.out.print("Enter list1: ");
		getArray(m1);

		System.out.print("Enter list2: ");
		getArray(m2);

		if (equals(m1, m2))
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays are not strictly identical");
	}

	public static void getArray(int[][] m) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0, rowLength = m.length; i < rowLength; i++) {
			for (int j = 0, colLength = m[i].length; j < colLength; j++) {
				m[i][j] = input.nextInt();
			}
		}
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		if (m1.length != m2.length)
			return false;
		for (int i = 0, rowLength = m1.length; i < rowLength; i++) {
			for (int j = 0, colLength = m1[i].length; j < colLength; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}

		return true;
	}
}
