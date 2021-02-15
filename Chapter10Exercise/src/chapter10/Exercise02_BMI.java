package chapter10;

import java.util.Scanner;

public class Exercise02_BMI {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter data
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter weight: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in feet and inches: ");
		double feet = input.nextDouble();
		double inches = input.nextDouble();

		// Create new BMI Object
		BMI bmi = new BMI(name, age, weight, feet, inches);

		// Display result
		System.out.println("\n\nName : " + bmi.getName());
		System.out.println("Age : " + bmi.getAge());
		System.out.println("Weight : " + bmi.getWeight());
		System.out.println("Height :" + bmi.getFeet() + " feet " + bmi.getInches() + " inches");
		System.out.println("BMI : " + bmi.getBMI() + " " + bmi.getStatus());
	}
}

class BMI {
	private String name;
	private int age;
	private double weight, feet, inches;
	private static final double KILOGRAMS_PER_POUND = 0.45359237;
	private static final double METERS_PER_INCH = 0.0254;

	public BMI(String name, int age, double weight, double feet, double inches) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	public BMI(String name, double weight, double feet, double inches) {
		this(name, 20, weight, feet, inches);
	}

	public String getName() {
		return name;
	}

	public double getFeet() {
		return feet;
	}

	public double getInches() {
		return inches;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	private double getHeight() {
		return feet * 12 + inches;
	}

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / (Math.pow(getHeight() * METERS_PER_INCH, 2));
		return Math.round(bmi * 100) / 100.0;
	}

	public String getStatus() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}

}
