package chapter13;

public class Exercise14_BenefitsOfEncapsulation {
	public static void main(String[] args) {
		// Create and initialize two rational numbers r1 and r2
		Rational r1 = new Rational(4, 2);
		Rational r2 = new Rational(2, 3);

		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}

class Rational extends Number implements Comparable<Rational> {
	// Data field for numerator and denominator
	private long[] r = new long[2];

	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.r[1] = Math.abs(denominator) / gcd;
	}

	// Find GCD of the two numbers
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	// Alternative way
//	private static long GCD(long n, long d) {
//		n = Math.abs(n);
//		d = Math.abs(d);
//		long gcd = n < d ? n : d;
//		for (;;) {
//			if (gcd == 1)
//				break;
//			if (n % gcd == 0 && d % gcd == 0)
//				break;
//			gcd--;
//		}
//		return gcd;
//	}

	// Return numerator
	public long getNumerator() {
		return r[0];
	}

	// Return denominator
	public long getDenominator() {
		return r[1];
	}

	// Add a rational number to this rational
	public Rational add(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator() + getDenominator() * secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Subtract a rational number from this rational
	public Rational subtract(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator() - getDenominator() * secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Multiply a rational number by this rational
	public Rational multiply(Rational secondRational) {
		long n = getNumerator() * secondRational.getNumerator();
		long d = getDenominator() * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Divide a rational number by this rational
	public Rational divide(Rational secondRational) {
		long n = getNumerator() * secondRational.getDenominator();
		long d = getDenominator() * secondRational.getNumerator();
		return new Rational(n, d);
	}

	@Override
	public boolean equals(Object obj) {
		if ((this.subtract((Rational) obj)).getNumerator() == 0)
			return true;
		return false;
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		if (getDenominator() == 1)
			return getNumerator() + "";
		return getNumerator() + "/" + getDenominator();
	}
}
