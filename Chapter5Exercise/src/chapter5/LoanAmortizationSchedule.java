package chapter5;

import java.util.Scanner;

public class LoanAmortizationSchedule {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive inputs
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Numbers of years: ");
		int numberOfYears = input.nextInt();

		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		// Compute monthly interest rate and monthly payment
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);

		// Display headings for amortization schedule
		System.out.println("Payment#\t\t" + "Interest\t\t" + "Principal\t\t" + "Balance");

		double balance = loanAmount;
		double interest;
		double principal;

		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;

			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}
	}
}
