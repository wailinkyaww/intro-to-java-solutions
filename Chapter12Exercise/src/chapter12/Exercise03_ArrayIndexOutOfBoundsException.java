package chapter12;

import java.util.Scanner;

public class Exercise03_ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int[] arr = new int[100];
		assignRandomValues(arr);

		try {
			System.out.print("Enter the index of the array: ");
			int index = input.nextInt();

			System.out.println("The corresponding element value is " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}

	public static void assignRandomValues(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
		}
	}
}
