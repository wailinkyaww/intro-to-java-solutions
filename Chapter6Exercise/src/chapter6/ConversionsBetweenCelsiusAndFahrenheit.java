package chapter6;

public class ConversionsBetweenCelsiusAndFahrenheit {
	public static void main(String[] args) {
		System.out.println("Celsius \t Fahrenheit \t | \t Fahrenheit \t Celsius");
		System.out.println("----------------------------------------------------------------");

		for (double c = 40, f = 120; c >= 31; f -= 10) {
			System.out.printf("%-7.1f \t %-10.2f \t | \t %-10.1f \t %-7.2f \n", c, celsiusToFahrenheit(c--), f,
					fahrenheitToCelsius(f));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
