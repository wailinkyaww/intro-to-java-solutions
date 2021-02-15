package chapter9;

import java.util.Date;

// Test program for account
public class Exercise07_Account {
	public static void main(String[] args) {
		// Create new Account
		Account account = new Account(1122, 20000);

		// Set annualInterestRate
		Account.setAnnualInterestRate(4.5);

		account.withdraw(2500);
		account.depoist(3000);

		// Display results
		System.out.println("The balance is: $" + account.getBalance());
		System.out.println("Monthly Interest is: $" + account.getMonthlyInterest());
		System.out.println("Account created date is: " + account.getDateCreated().toString());
	}
}

class Account {
	private int id;
	private double balance;
	private static double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
		this(0, 0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	private double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void depoist(double amount) {
		this.balance += amount;
	}

}
