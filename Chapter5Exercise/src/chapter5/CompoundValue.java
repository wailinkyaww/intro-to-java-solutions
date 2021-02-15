package chapter5;

import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter the number of months: ");
		int numberOfMonths = input.nextInt();

		double accountValue = 0;
		double monthlyInterestRate = annualInterestRate / 1200;

		// Calculate the account value
		for (int i = 1; i <= numberOfMonths; i++) {
			accountValue = (amount + accountValue) * (1 + monthlyInterestRate);
		}

		// Display results
		System.out.println("The amount in the saving account after " + numberOfMonths + " is "
				+ Math.round(accountValue * 1000) / 1000.0);

	}
}
