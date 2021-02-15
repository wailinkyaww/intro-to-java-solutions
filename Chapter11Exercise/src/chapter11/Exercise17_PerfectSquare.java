package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise17_PerfectSquare {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Enter an integer m: ");
		int m = input.nextInt();

		// Find the smallest factors
		PerfectSquare.findSmallestFactors(m);
		int n = PerfectSquare.getSmallestN(m);

		// Display results
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n  is " + (m * n));
	}
}

class PerfectSquare {
	private static ArrayList<Integer> factors = new ArrayList<>();

	public static void findSmallestFactors(int n) {
		int d = 2;
		while (n != 1) {
			if (isPrime(d) && n % d == 0) {
				n /= d;
				factors.add(d);
			} else
				d++;
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

	// n - smallest number for m * n to be a perfect square
	public static int getSmallestN(int n) {

		ArrayList<Integer> oddTimeNumber = new ArrayList<>();
		int current, product = 1, count = 0;
		for (int i = 0; i < factors.size(); i++) {
			current = factors.get(i);
			if (oddTimeNumber.contains(current))
				continue;
			count = 1;

			for (int j = i + 1; j < factors.size(); j++) {
				if (current == factors.get(j))
					count++;
			}
			if ((count & 1) == 1)
				product *= current;
			oddTimeNumber.add(current);
		}

		return product;
	}
}