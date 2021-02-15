package chapter6;

public class PrimeNumberMethod {
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;

		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.printf("%-5s\n", number);
				else
					System.out.printf("%-5s", number);
			}
			// Check the next number
			number++;
		}
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0)
				return false;
		}
		return true;
	}
}
