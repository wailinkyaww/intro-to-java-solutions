package chapter5;

public class MilesToKilometerss {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609;

		// Display heading title
		System.out.println("Miles \t\t Kilometers");

		// Display Body
		for (int miles = 1; miles <= 10; miles++) {
			System.out.printf("%d \t\t %.3f\n", miles, miles * KILOMETERS_PER_MILE);
		}
	}
}
