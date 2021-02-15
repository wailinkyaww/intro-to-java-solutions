package chapter5;

public class KilogramsToPounds {
	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM = 2.2;

		// Display heading title
		System.out.println("Kilograms\t\tPounds");

		for (int kilogram = 1; kilogram <= 199; kilogram++) {
			System.out.printf("%d \t\t\t %.1f\n", kilogram, kilogram * 2.2);
		}
	}
}
