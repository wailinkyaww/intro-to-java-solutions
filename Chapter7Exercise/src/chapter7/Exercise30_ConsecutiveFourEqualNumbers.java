package chapter7;

import java.util.Scanner;

public class Exercise30_ConsecutiveFourEqualNumbers {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the numbers values
		System.out.print("Enter the numbers of values: ");
		int n = input.nextInt();

		int[] values = new int[n];

		// Prompt user to enter the values
		System.out.print("Enter the values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}

		if (isConsecutiveFour(values))
			System.out.println("The list has consecutive fours");
		else
			System.out.println("The list has no consecutive fours");
	}

	public static boolean isConsecutiveFour(int[] x) {
		boolean flag = false;

		if (x.length < 4)
			return flag;
		for (int i = 0; i < x.length - 3; i++) {
			if (x[i] == x[i + 1] && x[i] == x[i + 2] && x[i] == x[i + 3] && x[i] == x[i + 3]) {
				flag = true;
				break;
			}
		}

		return flag;
	}
}
