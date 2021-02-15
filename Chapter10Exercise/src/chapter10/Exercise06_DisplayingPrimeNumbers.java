package chapter10;

public class Exercise06_DisplayingPrimeNumbers {
	public static void main(String[] args) {
		int n = 2;
		StackOfIntegers primes = new StackOfIntegers();
		for (; n < 120;) {
			if (isPrime(n))
				primes.push(n);
			n++;
		}

		System.out.println("Prime numbers less than 120 in decreasing order: ");
		while (!primes.empty()) {
			System.out.print(primes.pop() + " ");
		}
	}

	public static boolean isPrime(int n) {
		boolean flag = false;
		int d = 2;
		while (n % d != 0 && d <= Math.sqrt(n))
			d++;
		if (n % d != 0)
			flag = true;
		return n == 2 || flag;
	}
}
