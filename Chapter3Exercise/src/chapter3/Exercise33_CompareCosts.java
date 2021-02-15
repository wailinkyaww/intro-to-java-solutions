package chapter3;

import java.util.Scanner;

public class Exercise33_CompareCosts {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter weight and price for packages
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		// Calculate base prices
		double pricePerUnit1 = price1 / weight1;
		double pricePerUnit2 = price2 / weight2;
		
		// Display results
		if(pricePerUnit1 > pricePerUnit2)
			System.out.println("Package 2 has a better price.");
		else if (pricePerUnit1 < pricePerUnit2)
			System.out.println("Package 1 has a better price.");
		else
			System.out.println("Two package has the same price.");
	}
}
