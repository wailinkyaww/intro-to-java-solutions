package chapter5;

import java.util.Scanner;

public class DisplayPyramid {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of lines
		System.out.print("Enter the number of lines (1 to 15): ");
		int count = input.nextInt();

		int n, d;
		for (int i = 1; i <= count; i++) {
			n = i;
			d = -1;
			for (int k = 1; k <= count - i; k++)
				System.out.print("  ");
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(n + " ");
				if (n == 1)
					d = 1;
				n += d;
			}

			System.out.println();
		}
	}
}
