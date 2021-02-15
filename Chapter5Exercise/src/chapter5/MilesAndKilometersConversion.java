package chapter5;

public class MilesAndKilometersConversion {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609; // Constant

		// Display heading title
		System.out.print("Miles\t\tKilometers\t|\tKilometers\t\tMiles");

		int miles = 1;
		int kilometers = 20;

		// Display Conversion between miles and kilometers
		while (miles <= 10) {

			// Display miles to kilometers conversion
			System.out.printf("%d\t\t%.3f\t\t|", miles, miles * KILOMETERS_PER_MILE);

			// Display kilometers to miles conversion
			System.out.printf("\t%d\t\t\t%.3f\n", kilometers, kilometers / KILOMETERS_PER_MILE);

			miles++;
			kilometers += 5;
		}

	}
}
