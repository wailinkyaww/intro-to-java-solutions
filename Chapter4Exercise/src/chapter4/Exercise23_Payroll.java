package chapter4;

import java.util.Scanner;

public class Exercise23_Payroll {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter informations
		System.out.print("Enter employess's name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		final double HOURLY_PAY_RATE = input.nextDouble();

		System.out.print("Enter federal tax with holding rate: ");
		double federalTaxRate = input.nextDouble();

		System.out.print("Enter state tax with holding rate: ");
		double stateTaxRate = input.nextDouble();

		// Compute deduction and net pay
		double grossPay = hours * HOURLY_PAY_RATE;
		double federalTax = grossPay * federalTaxRate;
		double stateTax = grossPay * stateTaxRate;
		double netPay = grossPay - (federalTax + stateTax);

		// Display results
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + HOURLY_PAY_RATE);
		System.out.println("Gross Pay: $" + (int) (grossPay * 100) / 100.0);
		System.out.println("Deductions:");
		System.out
				.println("  Federal Withholding (" + federalTaxRate * 100 + "%): $" + (int) (federalTax * 100) / 100.0);
		System.out.println("  State Withholding (" + stateTaxRate * 100 + "%): $" + (int) (stateTax * 100) / 100.0);
		System.out.println("Total Deduction: $" + (int) ((federalTax + stateTax) * 100) / 100.0);
		System.out.println("Net Pay: $" + (int) (netPay * 100) / 100.0);
	}
}
