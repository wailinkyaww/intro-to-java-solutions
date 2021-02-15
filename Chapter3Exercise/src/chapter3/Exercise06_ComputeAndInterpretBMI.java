package chapter3;

import java.util.Scanner;

public class Exercise06_ComputeAndInterpretBMI {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		// Prompt user to enter height in feet
		System.out.print("Enter feet: ");
		int heightInFeet = input.nextInt();

		// Prompt user to enter height in inches
		System.out.print("Enter inches: ");
		int heightInInches = input.nextInt();

		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant

		// Calculate total height in inches and meters
		int height = heightInFeet * 12 + heightInInches;
		double heightInMeters = height * METERS_PER_INCH;

		double weightInKilograms = weight * KILOGRAMS_PER_POUND;

		// Calculate BMI
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display results
		System.out.println("BMI is " + bmi);
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
	}
}
