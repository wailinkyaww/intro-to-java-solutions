package chapter10;

import java.math.BigDecimal;

public class Exercise20_ApproximateE {
	public static void main(String[] args) {
		int i = 100;
		while (i <= 1000) {
			BigDecimal E = BigDecimal.ONE, d = BigDecimal.ONE;
			BigDecimal inc = BigDecimal.ONE;
			
			for (; inc.intValue() <= i;) {
				E = E.add(BigDecimal.ONE.divide(d.multiply(inc), 25, BigDecimal.ROUND_UP));
				d = d.multiply(inc);
				inc = inc.add(BigDecimal.ONE);
			}
			
			System.out.println("When i " + i + ", computed value of e : " + E);

			i += 100;
		}
	}
}
