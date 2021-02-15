package chapter5;

public class NumbersDivisibleBy5Or6NotBoth {
	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int number = 100;
		int correctCount = 0;

		while (number <= 200) {
			if (number % 5 == 0 ^ number % 6 == 0) {
				// Increase the correct count
				correctCount++;
				if (correctCount % NUMBERS_PER_LINE == 0) {
					// Display the number and advance to next line
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}

			// Check the next number
			number++;
		}
	}
}
