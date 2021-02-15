package chapter2;

import java.util.Scanner;

public class Exercise17_WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58F and -41F: ");
		double ta = input.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		int v = input.nextInt();

		double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));

		System.out.println(twc);
		System.out.println("The wind chill index is " + (int) (twc * 100000) / 100000.0);
	}
}
