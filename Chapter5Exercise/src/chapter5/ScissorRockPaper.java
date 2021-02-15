package chapter5;

import java.util.Scanner;

public class ScissorRockPaper {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		int computerWinCount = 0;
		int userWinCount = 0;

		do {
			// Generate a random number
			int number = (int) (Math.random() * 3);

			// Prompt user to choice
			System.out.print("scissor (0), rock (1), paper (2): ");
			int guess = input.nextInt();

			if (number == 0 && guess == 0)
				System.out.println("The computer is scissor. You are also scissor. It is a draw");
			else if (number == 0 && guess == 1) {
				System.out.println("The computer is scissor. You are rock. You win");
				userWinCount++;
			} else if (number == 0 && guess == 2) {
				System.out.println("The computer is scissor. You are paper. You lost");
				computerWinCount++;
			} else if (number == 1 && guess == 0) {
				System.out.println("The computer is rock. You are scissor. You lost");
				computerWinCount++;
			} else if (number == 1 && guess == 1)
				System.out.println("The computer is rock. You are also rock. It is a draw");
			else if (number == 1 && guess == 2) {
				System.out.println("The computer is rock. You are paper. You win");
				userWinCount++;
			} else if (number == 2 && guess == 0) {
				System.out.println("The computer is paper. You are scissor. You win");
				userWinCount++;
			} else if (number == 2 && guess == 1) {
				System.out.println("The computer is paper. You are rock. You lost");
				computerWinCount++;
			} else
				System.out.println("The computer is paper. You are also paper. It is a draw");

		} while (computerWinCount < 2 && userWinCount < 2);

	}
}
