package chapter10;

import java.math.BigInteger;

public class Exercise16_DivisibleBy2Or3 {
	public static void main(String[] args) {
		int count = 0;

		BigInteger n = new BigInteger(generate50DigitsValue());
		BigInteger ZERO = new BigInteger("0"), ONE = new BigInteger("1") ;
		BigInteger TWO = new BigInteger("2"), THREE = new BigInteger("3");

		for (; count < 10;) {
			if (n.remainder(TWO).equals(ZERO) || n.remainder(THREE).equals(ZERO)) {
				System.out.println(n);
				count++;
			}
			n = n.add(ONE);
		}
	}

	public static String generate50DigitsValue() {
		String s = "1";
		
		for (int i = 1; i++ < 50;)
			s += (char) 48;

		return s;
	}
}
