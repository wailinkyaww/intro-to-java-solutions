package chapter6;

public class PrimeNumberMethod {
	public static void main(String[] args) {
		int n = 2;
		int count = 0;
		while (n < 10000) {
			if (isPrime(n++))
				count++;
		}

		System.out.println("The number of prime numbers less than 10000 is " + count);
	}

	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0)
				return false;
		}
		return true;
	}
}
