package chapter12;

import java.util.Date;
import java.util.Scanner;

public class Exercise04_IllegalArgumentException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		try {
			Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

			// Display load date, monthly payment, and total payment
			System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n",
					loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}

class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() {
		this(2.5, 1, 1000);
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setLoanAmount(loanAmount);
		setNumberOfYears(numberOfYears);
		loanDate = new Date();
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("Annual interest rate cannot be less than or equal to zero");
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("Number of years cannot be less than or equal to zero");
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount <= 0)
			throw new IllegalArgumentException("Loan amount cannot be less than or equal to zero");
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	// Find monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	// Find total payment
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

}
