package chapter5;

public class NumbersDivisibleBy5And6 {
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int number = 100;
		int countNumber = 0; // To count numbers divisible by 5 and 6

		while (number <= 1000) {
			if (number % 5 == 0 && number % 6 == 0) {
				countNumber++;
				if (countNumber % NUMBERS_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}
