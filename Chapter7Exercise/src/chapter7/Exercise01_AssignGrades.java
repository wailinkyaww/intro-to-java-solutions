package chapter7;

import java.util.Scanner;

public class Exercise01_AssignGrades {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of students
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();

		int[] scores = new int[n];

		System.out.print("Enter " + n + " scores: ");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}

		int bestScore = getBestScore(scores);

		for (int i = 0; i < scores.length; i++) {
			int grade = getGrade(scores[i], bestScore);
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + (char) grade);
		}
	}

	public static char getGrade(int score, int best) {
		char ch;
		if (score >= best - 10)
			ch = 'A';
		else if (score >= best - 20)
			ch = 'B';
		else if (score >= best - 30)
			ch = 'C';
		else if (score >= best - 40)
			ch = 'D';
		else
			ch = 'F';

		return ch;
	}

	public static int getBestScore(int[] scores) {
		int max = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}

		return max;
	}
}
