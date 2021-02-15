package chapter3;

import java.util.Scanner;

public class Exercise17_ScissorRockPaper {
	public static void main(String[] args) {
		// Generate a random number 0, 1, or 2
		int number = (int) (Math.random() * 3);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter scissor, rock, or paper
		System.out.print("scissor (0), rock(1), paper(2): ");
		int guess = input.nextInt();

		if (number == 0 && guess == 0)
			System.out.println("The computer is scissor. You are also scissor. It is a draw");
		else if (number == 0 && guess == 1)
			System.out.println("The computer is scissor. You are rock. You win.");
		else if (number == 0 && guess == 2)
			System.out.println("The computer is scissor. You are paper. You lose.");
		else if (number == 1 && guess == 0)
			System.out.println("The computer is rock. You are scissor. You lose.");
		else if (number == 1 && guess == 1)
			System.out.println("The computer is rock. You are also rock. It is a draw");
		else if (number == 1 && guess == 2)
			System.out.println("The computer is rock. You are paper. You win.");
		else if (number == 2 && guess == 0)
			System.out.println("The computer is paper. You are scissor. You win.");
		else if (number == 2 && guess == 1)
			System.out.println("The computer is paper. You are rock. You lose");
		else
			System.out.println("The computer is paper. You are also paper. It is a draw.");

	}
}
