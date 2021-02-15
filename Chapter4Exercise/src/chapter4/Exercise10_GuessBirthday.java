package chapter4;

import java.util.Scanner;

public class Exercise10_GuessBirthday {
	public static void main(String[] args) {
		String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31\n";
		String set2 = " 2  3  6  7\n" + "10 11 14 14\n" + "18 19 22 23\n" + "26 27 30 31";
		String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 21\n";
		String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 21";
		String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 25 27\n" + "28 29 30 21";

		int day = 0;

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to answer questions
		System.out.print("Is your birthdat in Set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter Y for Yes and N for No: ");
		String answer = input.next();

		if (answer.length() == 1 && answer.charAt(0) == 'Y')
			day += 1;

		// Prompt user to answer questions
		System.out.print("\nIs your birthday in Set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter Y for Yes and N for No: ");
		answer = input.next();

		if (answer.length() == 1 && answer.charAt(0) == 'Y')
			day += 2;

		// Prompt user to answer questions
		System.out.print("\nIs your birthday in Set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter Y for Yes and N for No: ");
		answer = input.next();

		if (answer.length() == 1 && answer.charAt(0) == 'Y')
			day += 4;

		// Prompt user to answer questions
		System.out.print("\nIs your birthday in Set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter Y for Yes and N for No: ");
		answer = input.next();

		if (answer.length() == 1 && answer.charAt(0) == 'Y')
			day += 8;

		// Prompt user to answer questions
		System.out.print("\nIs your birthday in Set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter Y for Yes and N for No: ");
		answer = input.next();

		if (answer.length() == 1 && answer.charAt(0) == 'Y')
			day += 16;

		// Display the user's birthday 
		System.out.println("Your birthday is " + day + "!");
	}
}
