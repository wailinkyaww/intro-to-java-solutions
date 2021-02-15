package chapter5;

public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBERS_OF_PRIME_PER_LINE = 8;
		int count = 0;
		int number = 2;

		System.out.println("The prime numbers between 2 and 1,000 inclusive ares: \n");

		while (number <= 1000) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				count++;	// Increase count when the number is prime
				if (count % NUMBERS_OF_PRIME_PER_LINE == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");
			}

			// Check if the next number is prime
			number++;
		}

	}
}
