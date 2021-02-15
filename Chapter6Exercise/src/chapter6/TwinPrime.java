package chapter6;

public class TwinPrime {
	public static void main(String[] args) {
		displayTwinPrimes(1000);
	}

	public static void displayTwinPrimes(int total) {
		int n = 2;
		for (; n < total; n++) {
			if (n >= total)
				break;
			if (isPrime(n) && hasTwinPrime(n)) {
				System.out.println("(" + n + ", " + (n + 2) + ")");
			}
		}
	}

	public static boolean isPrime(int n) {
		int d = 2;
		for (; d <= n / 2;) {
			if (n % d++ == 0)
				return false;
		}
		return true;
	}

	public static boolean hasTwinPrime(int n) {
		return isPrime(n + 2);
	}
}
