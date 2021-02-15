package chapter5;

import java.util.Scanner;

public class FactorsOfAnInteger {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		int d = 2;

		while (n != d) {
			if (n % d == 0) {
				System.out.print(d + ", ");
				n /= d;
			} else
				d++;
		}
		System.out.print(d);

	}
}
