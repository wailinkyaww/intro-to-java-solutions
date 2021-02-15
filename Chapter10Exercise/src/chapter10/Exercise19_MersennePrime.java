package chapter10;

import java.math.BigInteger;

public class Exercise19_MersennePrime {
	public static void main(String[] args) {
		int p = 2;

		System.out.println("p\t\t2^p-1");
		
		for (;;) {
			if (p > 100)
				break;

			// 2^p - 1
			String st = String.format("%.0f", Math.pow(2, p));
			BigInteger n = new BigInteger(st);
			n = n.subtract(BigInteger.ONE);

			if (isPrime(n)) {
				System.out.println(p + "\t\t" + n);
			}
			p++;
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
