package chapter10;

import java.util.Scanner;

public class Exercise03_MyInteger {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter a number
		System.out.print("Enter a number: ");
		int n = input.nextInt();

		input = new Scanner(System.in);

		// Create new MyInteger Object
		MyInteger x = new MyInteger(n);

		System.out.println("\nYou entered " + x.getValue());
		System.out.println("Your number is odd ? " + x.isOdd());
		System.out.println("Your number is even ?" + x.isEven());
		System.out.println("Your number is prime ? " + x.isPrime());

		System.out.print("\nEnter a numeric string: ");
		String s = input.nextLine();
		n = MyInteger.parseInt(s);

		System.out.println("\nYou entered " + n);
		System.out.println(n + " is odd ? " + MyInteger.isOdd(n));
		System.out.println(n + " is even ? " + MyInteger.isEven(n));
		System.out.println(n + " is prime ? " + MyInteger.isPrime(n));

		// Create new MyInteger Object
		MyInteger x1 = new MyInteger(n);

		// Test static methods with MyInteger Object argument
		System.out.println("\nYour entered " + x1.getValue());
		System.out.println(x1.getValue() + " is odd ? " + MyInteger.isOdd(x1));
		System.out.println(x1.getValue() + " is even ? " + MyInteger.isEven(x1));
		System.out.println(x1.getValue() + " is prime ? " + MyInteger.isPrime(x1));
	}
}

class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isOdd() {
		return MyInteger.isOdd(value);
	}

	public boolean isEven() {
		return MyInteger.isEven(value);
	}

	public boolean isPrime() {
		return MyInteger.isPrime(value);
	}

	// static methods with int args
	public static boolean isOdd(int n) {
		return (n & 1) == 1 ? true : false;
	}

	public static boolean isEven(int n) {
		return !MyInteger.isOdd(n);
	}

	public static boolean isPrime(int n) {
		boolean flag = false;
		int d = 2;
		while (n % d != 0 && d <= Math.sqrt(n))
			d++;
		if (n % d != 0)
			flag = true;
		return n == 2 || flag;
	}

	// static methods MyInteger args
	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}

	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}

	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}

	public boolean equals(int n) {
		return value == n;
	}

	public boolean equals(MyInteger n) {
		return value == n.getValue();
	}

	public static int parseInt(char[] chars) {
		int n = 0;

		for (int i = 0; i < chars.length; i++) {
			if (Character.isDigit(chars[i]))
				n = n * 10 + (chars[i] - 48);
		}

		return n;
	}

	public static int parseInt(String s) {
		return parseInt(s.toCharArray());
	}

}
