package chapter10;

import java.math.BigInteger;

public class Exercise17_SquareNumbers {
	public static void main(String[] args) {
		int count = 10;
		final BigInteger ONE = new BigInteger("1");
		BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
		boolean flag = false;
		long baseValue = 0;
		
		while (!flag) {
			double baseDoubleValue = n.sqrt().doubleValue();
			long baseLongValue = (long) baseDoubleValue;
			if(baseDoubleValue - baseLongValue == 0) {
				baseValue = baseLongValue;
				flag = true;
			}
		}
		
		System.out.println("Ten Square numbers larger than Long.MAX_VALUE");
		
		for(;count-- > 0;) {
			n = new BigInteger(String.valueOf(baseValue++));
			n = n.multiply(n);
			System.out.println(n);
		}
	}
}
