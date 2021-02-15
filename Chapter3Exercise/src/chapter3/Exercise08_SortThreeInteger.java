package chapter3;

import java.util.Scanner;

public class Exercise08_SortThreeInteger {
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three integers
		System.out.print("Enter three integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		int temp;
		if (n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n2 > n3) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if (n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}

		System.out.println("Sorted: " + n1 + ", " + n2 + ", " + n3);
	}
}
