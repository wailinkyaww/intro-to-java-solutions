package chapter5;

public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Number of primes to display per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		System.out.println("The first 50 prime numbers are \n");

		// Repeatedly find the prime number
		while (count < NUMBER_OF_PRIMES) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number is prime?

			// Test whether the number is prime or not
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			// Display the prime number and increase the count
			if (isPrime) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the number advance to the new line
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			// Check if the next number is prime
			number++;
		}
	}
}
