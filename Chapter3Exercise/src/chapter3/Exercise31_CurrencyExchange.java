package chapter3;

import java.util.Scanner;

public class Exercise31_CurrencyExchange {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter exchange rate
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		final double EXCHANGE_RATE = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int status = input.nextInt();

		// Receive and convert dollars and yuan
		if (status == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollars = input.nextDouble();
			double yuan = dollars * EXCHANGE_RATE;
			System.out.println("$" + dollars + " is " + yuan + " yuan");
		} else if (status == 1) {
			System.out.print("Enter the RMB amount: ");
			double yuan = input.nextDouble();
			double dollars = yuan / EXCHANGE_RATE;
			System.out.println(yuan + " yuan is $" + (int)(dollars * 100) / 100.0);
		} else {
			System.out.println("Incorrect input.");
		}
	}
}
