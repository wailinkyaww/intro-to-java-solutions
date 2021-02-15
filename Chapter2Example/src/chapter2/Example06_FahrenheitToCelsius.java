package chapter2;

import java.util.Scanner;

public class Example06_FahrenheitToCelsius {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter Fahrenheit
		System.out.print("Enter degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		// Convert to celsius
		double celsius = 5.0 / 9 * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}
