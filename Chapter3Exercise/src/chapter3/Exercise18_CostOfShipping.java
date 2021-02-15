package chapter3;

import java.util.Scanner;

public class Exercise18_CostOfShipping {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter weight in pounds
		System.out.print("Enter the weight of the package in pounds: ");
		int weight = input.nextInt();

		// Calculate the cost of shipping
		double cost = 0;
		if (weight > 0 && weight <= 1)
			cost = 3.5;
		else if (weight <= 3)
			cost = 5.5;
		else if (weight <= 10)
			cost = 8.5;
		else if (weight <= 20)
			cost = 10.5;
		else if (weight > 50) {
			System.out.println("The package cannot be shipped.");
			System.exit(1);
		}
		System.out.println("The cost of shipping the package of weight " + weight + " pounds is $" + cost + "dollars.");
	}
}
