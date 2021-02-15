package chapter5;

import java.util.Scanner;

public class ComputeCDValue {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive inputs
		System.out.print("Enter the initial deposite amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter annual percentage yield: ");
		double annualPercentage = input.nextDouble();

		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonths = input.nextInt();

		double cdValue = amount;

		// Display heading title
		System.out.println("Month\tCD Value");

		// Calculate and display result
		for (int i = 1; i <= numberOfMonths; i++) {
			cdValue = cdValue + cdValue * annualPercentage / 1200;

			System.out.println(i + "\t" + Math.round(cdValue * 100) / 100.0);
		}

	}
}
