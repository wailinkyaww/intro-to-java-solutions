package chapter13;

import java.util.Scanner;

public class Exercise20_SolveQuadraticEquations {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Create new Equation
		QuadraticEduation equation = new QuadraticEduation(a, b, c);

		double discriminant = equation.getDiscriminant();

		if (discriminant > 0)
			System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
		else if (discriminant == 0)
			System.out.println("The root is " + equation.getRoot1());
		else {
			System.out.println(equation.getImaginaryRoot1() + " and " + equation.getImaginaryRoot2());
		}
	}
}

class QuadraticEduation {
	private double a, b, c;

	public QuadraticEduation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	public double getRoot1() {
		double r = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
		r = Math.round(r * 1000000) / 1000000.0;
		return r;
	}

	public double getRoot2() {
		double r = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
		r = Math.round(r * 100000) / 100000.0;
		return r;
	}

	public String getImaginaryRoot1() {
		double imaginaryPart = Math.sqrt((Math.pow(b, 2) - 4 * a * c) * -1) / (2 * a);
		imaginaryPart = Math.round(imaginaryPart * 10000) / 10000.0;
		Complex n = new Complex(-b / (2 * a), imaginaryPart);
		return n.toString();
	}

	public String getImaginaryRoot2() {
		double imaginaryPart = -Math.sqrt((Math.pow(b, 2) - 4 * a * c) * -1) / (2 * a);
		imaginaryPart = Math.round(imaginaryPart * 10000) / 10000.0;
		Complex n = new Complex(-b / (2 * a), imaginaryPart);
		return n.toString();
	}
}
