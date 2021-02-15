package chapter6;

public class MersennePrime {
	public static void main(String[] args) {
		displayMersennerPrime(31);
	}

	public static void displayMersennerPrime(int n) {
		// Display heading of the table
		System.out.println("p\t\t\t2^p-1");
		System.out.println("-----------------------------");

		// Display content of the table
		int p = 2;
		for (;; p++) {
			if (p > n)
				break;
			int merssenePrime = (int) Math.pow(2, p) - 1;
			if (isPrime(merssenePrime))
				System.out.println(p + "\t\t\t" + merssenePrime);
		}
	}

	public static boolean isPrime(int n) {
		int d = 2;
		for (;;) {
			if (d > n / 2)
				break;
			if (n % d++ == 0)
				return false;
		}
		return true;
	}
}
