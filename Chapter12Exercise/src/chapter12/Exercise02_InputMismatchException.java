package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise02_InputMismatchException {
	public static void main(String[] args) throws InputMismatchException {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter two integers: ");
				int n1 = input.nextInt();
				int n2 = input.nextInt();

				int sum = n1 + n2;
				System.out.println("The sum of the two integers is " + sum);

				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("The numbers are invalid");
				input.nextLine();
			}
		} while (continueInput);
	}
}
