package chapter10;

import java.util.Scanner;

public class Exercise05_DisplayingPrimeFactors {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		StackOfIntegers factors = new StackOfIntegers();

		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		int d = 2;

		for (;;) {
			if(n == 1) break;
			if (isPrime(d) && n % d == 0) {
				factors.push(d);
				n /= d;
			} else
				d++;
		}

		System.out.print("The prime factors are: ");
		while (!factors.empty()) {
			System.out.print(factors.pop() + " ");
		}
	}

	public static boolean isPrime(int n) {
		boolean flag = true;
		int d = 2;
		while (n % d != 0 && d <= Math.sqrt(n))
			d++;
		if (n % d == 0)
			flag = false;
		return n == 2 || flag;
	}
}
