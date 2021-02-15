package chapter4;

import java.util.Scanner;

public class Exercise26_ComputeChange {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive an amount
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.next();

		// Extract dollars and cents
		int dollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		// Find the number of quarters
		int numberOfQuarters = cents / 25;
		cents %= 25;

		// Find the number of dimes
		int numberOfDimes = cents / 10;
		cents %= 10;

		// Find the number of nickels
		int numberOfNickels = cents / 5;
		cents %= 5;

		// Find the number of pennies
		int numberOfPennies = cents;

		// Display results
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println("	" + dollars + (dollars > 1 ? " dollars" : " dollar"));
		System.out.println("	" + numberOfQuarters + (numberOfQuarters > 1 ? " quarters" : " quarter"));
		System.out.println("	" + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
		System.out.println("	" + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel"));
		System.out.println("	" + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));
	}
}
