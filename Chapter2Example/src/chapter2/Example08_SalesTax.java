package chapter2;

import java.util.Scanner;

public class Example08_SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for purchase amount
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();

		// Compute tax
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
	}
}
