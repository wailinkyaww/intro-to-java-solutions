package chapter6;

public class NumberOfDaysInAYear {
	public static void main(String[] args) {
		int year = 2000;
		for (;;) {
			if (year > 2020)
				break;
			System.out.println(year + " has " + numbersOfDaysInAYear(year++) + " days");
		}
	}

	public static int numbersOfDaysInAYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return 366;
		return 365;
	}
}
