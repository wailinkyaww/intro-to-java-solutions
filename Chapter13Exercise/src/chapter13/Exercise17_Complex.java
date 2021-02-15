package chapter13;

import java.util.Scanner;

// Driver class for client testing
public class Exercise17_Complex {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter
		System.out.print("Enter the first number: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();

		System.out.print("Enter the second number: ");
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();

		// Create two Complex Numbers
		Complex number1 = new Complex(a1, b1);
		Complex number2 = new Complex(a2, b2);

		// Display results
		displayResult(number1, number2, '+', number1.add(number2).toString());
		displayResult(number1, number2, '-', number1.subtract(number2).toString());
		displayResult(number1, number2, '*', number1.multiply(number2).toString());
		displayResult(number1, number2, '/', number1.divide(number2).toString());

		System.out.println("|(" + a1 + " + " + b1 + ")| = " + number1.abs());
	}

	public static void displayResult(Complex n1, Complex n2, char ch, String answer) {
		System.out.println("(" + n1.getRealPart() + " + " + n1.getImaginaryPart() + "i ) " + ch + " ("
				+ n2.getRealPart() + " + " + n2.getImaginaryPart() + "i ) = " + answer);
	}
}

class Complex implements Cloneable {
	private final double realPart;
	private final double imaginaryPart;

	public Complex() {
		this(0, 0);
	}

	public Complex(double realPart) {
		this(realPart, 0);
	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public Complex add(Complex object) {
		double realPart = this.realPart + object.getRealPart();
		double imaginaryPart = this.imaginaryPart + object.getImaginaryPart();
		return new Complex(realPart, imaginaryPart);
	}

	public Complex subtract(Complex object) {
		double realPart = this.realPart - object.getRealPart();
		double imaginaryPart = this.imaginaryPart - object.getImaginaryPart();
		return new Complex(realPart, imaginaryPart);
	}

	public Complex multiply(Complex object) {
		double realPart = this.realPart * object.getRealPart() - this.imaginaryPart * object.getImaginaryPart();
		double imaginaryPart = this.imaginaryPart * object.getRealPart() + this.realPart * object.getImaginaryPart();
		return new Complex(realPart, imaginaryPart);
	}

	public Complex divide(Complex object) {
		double realPart = (this.realPart * object.getRealPart() + this.imaginaryPart * object.getImaginaryPart())
				/ (Math.pow(object.getRealPart(), 2) + Math.pow(object.getImaginaryPart(), 2));
		double imaginaryPart = (this.imaginaryPart * object.getRealPart() - this.realPart * object.getImaginaryPart())
				/ (Math.pow(object.getRealPart(), 2) + Math.pow(object.getImaginaryPart(), 2));
		return new Complex(realPart, imaginaryPart);
	}

	public double abs() {
		return Math.hypot(realPart, imaginaryPart);
	}

	@Override
	public String toString() {
		return realPart + " + " + imaginaryPart + "i";
	}
}
