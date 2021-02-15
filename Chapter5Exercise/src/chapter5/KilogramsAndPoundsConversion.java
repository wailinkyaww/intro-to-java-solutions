package chapter5;

public class KilogramsAndPoundsConversion {
	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM = 2.2;

		// Display table heading title
		System.out.print("Kilogram\tPounds\t|\t");
		System.out.print("Pounds\tKilograms\n");

		int kilograms, pounds;

		// Display table body
		for (kilograms = 1, pounds = 20; kilograms <= 199; kilograms += 2, pounds += 5) {
			System.out.printf("%d\t\t%.1f\t|\t%d\t%.2f\n", kilograms, kilograms * POUNDS_PER_KILOGRAM, pounds,
					pounds / POUNDS_PER_KILOGRAM);
		}
	}
}
