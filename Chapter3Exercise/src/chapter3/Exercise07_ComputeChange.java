package chapter3;

import java.util.Scanner;

public class Exercise07_ComputeChange {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		// Find the amount of one dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of ");
		System.out.println("	" + numberOfDollars + (numberOfDollars > 1 ? " dollars" : " dollar"));
		System.out.println("	" + numberOfQuarters + (numberOfQuarters > 1 ? " quartes" : " quarter"));
		System.out.println("	" + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
		System.out.println("	" + numberOfNickels + (numberOfNickels > 1 ? " nickles" : " nickle"));
		System.out.println("	" + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));

	}
}
