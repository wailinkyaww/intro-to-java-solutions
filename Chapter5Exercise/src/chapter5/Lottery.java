package chapter5;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Generate the first digit
		int lotteryDigit1 = (int) (Math.random() * 10);
		int lotteryDigit2;
		do {
			lotteryDigit2 = (int) (Math.random() * 10);
		} while (lotteryDigit1 == lotteryDigit2);

		// Prompt user to enter a guess
		System.out.print("Enter your lottery pick ( only two digits): ");
		int guess = input.nextInt();

		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		// Show the lottery number
		System.out.println("The lottery number is " + lotteryDigit1 + "" + lotteryDigit2);

		// Check the guess
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: You win $10,000");
		else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
			System.out.println("Match all digits: You win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: You win $1,000");
		else
			System.out.println("Sorry no match");
	}
}
