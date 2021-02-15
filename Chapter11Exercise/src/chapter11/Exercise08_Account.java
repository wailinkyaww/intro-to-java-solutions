package chapter11;

import java.util.ArrayList;
import java.util.Date;

public class Exercise08_Account {
	public static void main(String[] args) {
		// Create a NewAccount
		NewAccount account = new NewAccount("George", 1000, 1122);

		NewAccount.setAnnualInterestRate(1.5);

		// Deposit
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		// Withdraw
		account.widthdraw(5);
		account.widthdraw(4);
		account.widthdraw(2);

		// Display results
		System.out.println("Account Holder Name: \t" + account.getName());
		System.out.println("Monthly Interest Rate: \t" + account.getMonthlyInterestRate());
		System.out.println("Annual Interest Rate: \t" + NewAccount.getAnnualInterestRate());
		System.out.println("Balance: \t\t" + account.getBalance());

		ArrayList<Transaction> transactions = account.getTransactions();

		for (int i = 0; i < transactions.size(); i++) {
			Transaction transaction = transactions.get(i);
			System.out.println("Transaction: type = " + transaction.getType() + ", amount = " + transaction.getAmount()
					+ ", balance = " + transaction.getBalance() + ", Description : " + transaction.getDescription());
		}
	}
}

class NewAccount {
	protected String name;
	protected double balance;
	protected int id;
	protected static double annualInterestRate = 0;
	protected Date dateCreated;
	protected ArrayList<Transaction> transactions = new ArrayList<>();

	public NewAccount(String name, double balance, int id) {
		this.name = name;
		this.balance = balance;
		this.id = id;
		dateCreated = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		NewAccount.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return balance * getAnnualInterestRate();
	}

	public void widthdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, "Withdraw " + amount));
	}

	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit " + amount));
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

}

class Transaction {
	private Date dateCreated;
	private char type;
	private double amount, balance;
	private String description;

	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		dateCreated = new Date();
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "[ Transaction : type = " + type + ", amount = " + amount + ", balance = " + balance + "\nDescription:"
				+ description;
	}
}