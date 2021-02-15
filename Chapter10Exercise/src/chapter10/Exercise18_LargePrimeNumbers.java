package chapter10;

import java.math.BigInteger;

public class Exercise18_LargePrimeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1;

		BigInteger n = new BigInteger((Long.MAX_VALUE) + "");

		int count = 0;
		int i = 0;
		for (;;) {
			if (count >= NUMBER_OF_PRIMES)
				break;
			if (isPrime(n)) {
				System.out.println(n);
				count++;
			}
			n = n.add(new BigInteger("2"));
		}

	}

	public static boolean isPrime(BigInteger n) {
		boolean flag = false;
		BigInteger d = new BigInteger("2");

		if (n.compareTo(d) == 0)
			return true;
		if (n.remainder(d).compareTo(BigInteger.ZERO) == 0)
			return false;

		while (n.remainder(d).compareTo(BigInteger.ZERO) != 0 && d.compareTo(n.sqrt()) <= 0)
			d = d.add(BigInteger.ONE);

		if (n.remainder(d).compareTo(BigInteger.ZERO) != 0)
			flag = true;

		return flag;
	}
}
