package chapter5;

public class DisplayLeapYears {
	public static void main(String[] args) {
		final int YEARS_PER_LINE = 10;
		int leapYearCount = 0;

		for (int year = 101; year <= 2100; year++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				// Increase leap year count
				leapYearCount++;
				if (leapYearCount % YEARS_PER_LINE == 0) {
					// Display the leap year and advance to the new line
					System.out.println(year);
				} else
					System.out.print(year + " ");
			}
		}

		// Display leap year count
		System.out.println("\nThe number of leap years in the period: " + leapYearCount);

	}
}
