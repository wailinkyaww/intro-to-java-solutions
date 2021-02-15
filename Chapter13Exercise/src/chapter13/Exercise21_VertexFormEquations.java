package chapter13;

import java.util.Scanner;

public class Exercise21_VertexFormEquations {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a, b, c
		System.out.print("Enter a, b, c: ");
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();

		Rational A = new Rational(a, 1);
		Rational B = new Rational(b, 1);
		Rational C = new Rational(c, 1);

		// h = -b / (2 * a)
		Rational h = new Rational(-B.getNumerator(), 2 * A.getNumerator());

		// k = c - (a * h^2)
		Rational k = C.subtract((A.multiply(h.multiply(h))));

		// Display results
		System.out.println(" h is " + h + " k is " + k);
	}
}
