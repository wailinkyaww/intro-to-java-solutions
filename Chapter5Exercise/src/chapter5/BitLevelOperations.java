package chapter5;

import java.util.Scanner;

public class BitLevelOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		short n = input.nextShort();

		String st = "";

		for (int i = 1; i <= 16; i++) {
			st = (n & 1) + st;
			n = (short) (n >> 1);
		}

		System.out.println(st);
	}
}
