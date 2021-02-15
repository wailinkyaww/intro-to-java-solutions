package chapter10;

import java.util.Scanner;

// Test Program
public class Exercise08_Tax {
	public static void main(String[] args) {
		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, // Single filer
				{ 16700, 67900, 137050, 20885, 372950 }, // Married jointly -or qualifying widow(er)
				{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
				{ 11950, 45500, 117450, 190200, 372950 } // Head of household};
		};
		
		Tax tax = new Tax();
		tax.setRates(rates);
		tax.setBrackets(brackets);
		
		Scanner input = new Scanner(System.in);

		System.out.printf("Single filers (%d), Married Jointly (%d), Married Separately (%d), Head Of House(%d) ",
				Tax.SINGLE_FILER, Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, Tax.MARRIED_SEPARATELY,
				Tax.HEAD_OF_HOUSEHOLD);
		tax.setFilingStatus(input.nextInt());
		
		System.out.print("Enter taxable income amount: ");
		tax.setTaxableIncome(input.nextDouble());
		
		System.out.println("Tax: " + tax.getTax());
	}
}

class Tax {
	public static final int SINGLE_FILER = 0, MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1, MARRIED_SEPARATELY = 2,
			HEAD_OF_HOUSEHOLD = 3;
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;

	public Tax() {
		
	}
	
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}

	public int getFilingStatus() {
		return filingStatus;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		double tax = taxableIncome * brackets[filingStatus][0];

		if (taxableIncome <= brackets[filingStatus][0]) {
			tax = taxableIncome * rates[0];
		} else if (taxableIncome <= brackets[filingStatus][1]) {
			tax = brackets[filingStatus][0] * rates[0] + (taxableIncome - brackets[filingStatus][0]) * rates[1];
		} else if (taxableIncome <= brackets[filingStatus][2]) {
			tax = brackets[filingStatus][0] * rates[0]
					+ (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
					+ (taxableIncome - brackets[filingStatus][1]) * rates[2];
		} else if (taxableIncome <= brackets[filingStatus][3]) {
			tax = brackets[filingStatus][0] * rates[0]
					+ (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
					+ (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
					+ (taxableIncome - brackets[filingStatus][2]) * rates[3];
		} else if (taxableIncome <= brackets[filingStatus][4]) {
			tax = brackets[filingStatus][0] * rates[0]
					+ (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
					+ (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
					+ (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
					+ (taxableIncome - brackets[filingStatus][3]) * rates[4];
		} else {
			tax = brackets[filingStatus][0] * rates[0]
					+ (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
					+ (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
					+ (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
					+ (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4]
					+ (taxableIncome - brackets[filingStatus][4]) * rates[5];
		}

		return tax;
	}

}
