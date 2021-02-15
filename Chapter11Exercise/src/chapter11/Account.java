package chapter11;

import java.util.Date;

public class Account {
	protected int id;
	protected double balance;
	protected static double annualInterestRate = 0;
	protected Date dateCreated;

	public Account() {
		this(0, 0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date(System.currentTimeMillis());
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

	public double getMonthlyInterestRate() {
		return Account.annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Id = " + id + ", Balance = " + balance + ", Annual Interest Rate = " + Account.annualInterestRate;
	}
}


