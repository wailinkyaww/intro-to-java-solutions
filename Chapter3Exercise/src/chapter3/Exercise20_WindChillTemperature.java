package chapter3;

import java.util.Scanner;

public class Exercise20_WindChillTemperature {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the temperature
		System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F : ");
		double temperature = input.nextDouble();

		// Receive the wind speed
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		int windSpeed = input.nextInt();

		// Calculate wind-chill
		if (temperature >= -58 && temperature <= 41 && windSpeed >= 2) {
			double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
					+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			// Display result
			System.out.println("The wind chill index is " + windChill);
		} else if (temperature > -58 && temperature < 41 && windSpeed < 2) {
			System.out.println("The wind speed is invalid.");
		} else if (!(temperature > -58 && temperature < 41) && windSpeed >= 2) {
			System.out.println("The temperature is invalid.");
		} else {
			System.out.println("Both the temperature and wind speed is invalid.");
		}
	}
}
