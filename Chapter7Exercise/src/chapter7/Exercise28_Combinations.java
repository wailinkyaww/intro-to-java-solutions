package chapter7;

import java.util.Scanner;

public class Exercise28_Combinations {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		// Prompt user to enter 10 numbers 
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		
	}
}
