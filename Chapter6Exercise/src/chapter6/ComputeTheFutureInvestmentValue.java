package chapter6;

import java.util.Scanner;

public class ComputeTheFutureInvestmentValue {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double amount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Years\t\tFuture Value");

		double futureInvestmentValue = 0;

		for (int i = 1; i <= 30; i++) {
			futureInvestmentValue = futureInvestmentValue(amount, annualInterestRate / 1200, i);
			System.out.printf("%d\t%.2f\n", i, (int) (futureInvestmentValue * 100) / 100.0);
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
	}
}
