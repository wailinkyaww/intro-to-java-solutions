package chapter11;

public class Exercise03_SubclassesOfAccount {
	public static void main(String[] args) {
		// Create Accounts
		Account account = new Account();
		CheckingAccount checkingAccount = new CheckingAccount(1, 10000);
		SavingsAccount savingsAccount = new SavingsAccount(1, 2000);

		Account.annualInterestRate = 5;

		System.out.println(account);
		System.out.println("\n" + checkingAccount.toString());
		System.out.println("\n" + savingsAccount.toString());
	}
}

class CheckingAccount extends Account {
	private static final double OVERDRAFT_AMOUNT = 1000;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance + OVERDRAFT_AMOUNT)
			return;
		balance -= amount;
	}

	@Override
	public String toString() {
		return "[Checking Account: \n" + super.toString() + ", Overdraft Amount = " + OVERDRAFT_AMOUNT + " ]";
	}
}

class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance)
			return;
		balance -= amount;
	}

	@Override
	public String toString() {
		return "[Saving Account: \n" + super.toString() + " ]";
	}
}