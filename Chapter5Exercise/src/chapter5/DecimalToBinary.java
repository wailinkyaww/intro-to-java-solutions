package chapter5;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter 
		System.out.print("Enter a decimal integer: ");
		int number = input.nextInt();
		
		String binaryString = "";
		
		while(number != 0) {
			binaryString =  number % 2 + binaryString;
			number = number / 2;
		}
		
		System.out.println("The corresponding binary value is " + binaryString);
	}
}
