package chapter7;

public class Exercise06_PrimeNumber {
	public static void main(String[] args) {
		int count = 1, n = 3, d;
		int[] primes = new int[50];
		primes[0] = 2;

		while (count < 50) {
			d = 2;
			while (n % d != 0 && d <= Math.sqrt(n))
				d++;
			if (n % d != 0)
				primes[count++] = n;
			n++;
		}

		display(primes);
	}

	public static void display(int[] x) {
		final int PRIMES_PER_LINE = 10;
		for (int i = 0; i < x.length; i++) {
			if ((i + 1) % PRIMES_PER_LINE == 0)
				System.out.printf("%3d \n",x[i]);
			else
				System.out.printf("%3d ",x[i]);
		}
	}
}
