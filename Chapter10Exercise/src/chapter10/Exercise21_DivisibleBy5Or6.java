package chapter10;

import java.math.BigInteger;

public class Exercise21_DivisibleBy5Or6 {
	public static void main(String[] args) {
		int count = 0;
		BigInteger n = new BigInteger(Long.MAX_VALUE + "");
		final BigInteger FIVE = new BigInteger("5"), SIX = new BigInteger("6");

		System.out.println("The first ten numbers greater than Long.MAX_VALUE \nthat are divisible by 5 or 6: ");

		while (count < 10) {
			if (n.remainder(FIVE).intValue() == 0 || n.remainder(SIX).intValue() == 0) {
				count++;
				System.out.println(n);
			}
			n = n.add(BigInteger.ONE);
		}
	}
}
