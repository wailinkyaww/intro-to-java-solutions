//package chapter13;
//
//import java.math.BigInteger;
//
//public class Exercise15_RationalWithBigInteger {
//	public static void main(String[] args) {
//		Rational r = new Rational(new BigInteger("7"), new BigInteger("3"));
//	}
//}
//
//class Rational extends Number implements Comparable<Rational> {
//
//	private BigInteger[] r = new BigInteger[2];
//
//	public Rational(BigInteger numerator, BigInteger denominator) {
//		BigInteger gcd = gcd(numerator, denominator);
//		r[0] = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1")).multiply(numerator)
//				.divide(gcd);
//		r[1] = denominator.divide(gcd);
//	}
//
//	private static BigInteger gcd(BigInteger n, BigInteger d) {
//		BigInteger gcd = (n.compareTo(d) < 0) ? n : d;
//		for (;;) {
//			if (gcd.equals(BigInteger.ONE))
//				break;
//			if (n.remainder(gcd).equals(BigInteger.ZERO) && d.remainder(gcd).equals(BigInteger.ZERO))
//				break;
//			gcd = gcd.subtract(BigInteger.ONE);
//		}
//
//		return gcd;
//	}
//
//	// Return Numerator
//	public BigInteger getNumerator() {
//		return r[0];
//	}
//
//	// Return Denominator
//	public BigInteger getDenominator() {
//		return r[1];
//	}
//
//	// Add a rational number to this rational
//	public Rational add(Rational secondRational) {
//		BigInteger n = (r[0].multiply(secondRational.getDenominator()))
//				.add(r[1].multiply(secondRational.getNumerator()));
//		BigInteger d = r[1].multiply(secondRational.getDenominator());
//		return new Rational(n, d);
//	}
//
//	// Subtract a rational number from this rational
//	public Rational subtract(Rational secondRational) {
//		BigInteger n = (r[0].multiply(secondRational.getDenominator()))
//				.subtract(r[1].multiply(secondRational.getNumerator()));
//		BigInteger d = r[1].multiply(secondRational.getDenominator());
//		return new Rational(n, d);
//	}
//
//	// Multiple a rational number by this number
//	public Rational multiply(Rational secondRational) {
//		BigInteger n = r[0].multiply(secondRational.getNumerator());
//		BigInteger d = r[1].multiply(secondRational.getDenominator());
//		return new Rational(n, d);
//	}
//
//	// Divide a rational number by this number
//	public Rational divide(Rational secondRational) {
//		BigInteger n = r[0].multiply(secondRational.getDenominator());
//		BigInteger d = r[1].multiply(secondRational.getNumerator());
//		return new Rational(n, d);
//	}
//
//	@Override
//	public int compareTo(Rational o) {
//		BigInteger n = this.subtract(o).getNumerator();
//		if (n.compareTo(BigInteger.ZERO) > 0)
//			return 1;
//		else if (n.compareTo(BigInteger.ZERO) < 0)
//			return -1;
//		else
//			return 0;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this.subtract((Rational) obj).getNumerator().compareTo(BigInteger.ZERO) == 0)
//			return true;
//		return false;
//	}
//
//	@Override
//	public int intValue() {
//		return (int) doubleValue();
//	}
//
//	@Override
//	public long longValue() {
//		return (long) doubleValue();
//	}
//
//	@Override
//	public float floatValue() {
//		return (float) doubleValue();
//	}
//
//	@Override
//	public double doubleValue() {
//		return r[0].doubleValue() / r[1].doubleValue();
//	}
//
//	@Override
//	public String toString() {
//		if (r[1].compareTo(BigInteger.ONE) == 0)
//			return r[0].toString();
//		else
//			return r[0] + " / " + r[1];
//	}
//
//}
