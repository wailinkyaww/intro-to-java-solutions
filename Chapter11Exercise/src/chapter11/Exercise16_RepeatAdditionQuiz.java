package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16_RepeatAdditionQuiz {
	private static ArrayList<Integer> answers = new ArrayList<>();
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int n1 = (int) (Math.random() * 10);
		int n2 = (int) (Math.random() * 10);

		System.out.print("What is " + n1 + " + " + n2 + " ? ");
		int answer = input.nextInt();

		while (answer != n1 + n2) {
			if (answers.contains(answer))
				System.out.println("You have already enterd " + answer);
			answers.add(answer);
			System.out.print("Wrong answer. Try again. What is " + n1 + " + " + n2 + " ? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}
