package chapter13;

public class Test {
	public static void main(String[] args) {
		Rational r1 = new Rational(1,123456789);
		Rational r2 = new Rational(1,123456789);
		Rational r3 = new Rational(1,123456789);
		
		System.out.println(r1.multiply(r2).multiply(r3));
	}
}
