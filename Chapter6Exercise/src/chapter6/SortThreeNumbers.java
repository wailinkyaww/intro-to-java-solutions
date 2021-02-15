package chapter6;

import java.util.Scanner;

public class SortThreeNumbers {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three integers
		System.out.print("Enter three integers: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		displaySortedNumbers(n1, n2, n3);
	}

	public static void displaySortedNumbers(double n1, double n2, double n3) {
		if (n1 < n2) {
			if (n1 < n3) {
				if (n2 < n3)
					System.out.println(n1 + ", " + n2 + ", " + n3);
				else
					System.out.println(n1 + ", " + n3 + ", " + n2);
			} else
				System.out.println(n3 + ", " + n1 + ", " + n2);
		} else {
			if (n2 < n3) {
				if (n1 < n3)
					System.out.println(n2 + ", " + n1 + ", " + n3);
				else
					System.out.println(n2 + ", " + n3 + ", " + n1);
			} else
				System.out.println(n3 + ", " + n2 + ", " + n1);
		}
	}
}
