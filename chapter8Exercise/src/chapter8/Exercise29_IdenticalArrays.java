package chapter8;

import java.util.Scanner;

public class Exercise29_IdenticalArrays {
	public static void main(String[] args) {
		// Create Two 3 x 3 matrix
		int[][] m1 = new int[3][3], m2 = new int[3][3];
		
		// Prompt user to enter two matrix
		System.out.print("Enter list1: ");
		getArray(m1);
		
		System.out.print("Enter list2: ");
		getArray(m2);
		
		if(equals(m1, m2))
			System.out.println("The two arrays are identical");
		else
			System.out.println("The two arrays are not identical");
 	}

	public static void getArray(int[][] m) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0, rowLength = m.length; i < rowLength; i++) {
			for (int j = 0, colLength = m[i].length; j < colLength; j++)
				m[i][j] = input.nextInt();
		}
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0, rowLength = m1.length; i < rowLength; i++) {
			for (int j = 0, colLength = m1[i].length; j < colLength; j++) {
				int n = m1[i][j];
				if (count(n, m1) != count(n, m2))
					return false;
			}
		}

		return true;
	}

	public static int count(int n, int[][] m) {
		int count = 0;
		for (int i = 0, rowLength = m.length; i < rowLength; i++) {
			for (int j = 0, colLength = m[i].length; j < colLength; j++) {
				if (m[i][j] == n)
					count++;
			}
		}
		return count;
	}
}
