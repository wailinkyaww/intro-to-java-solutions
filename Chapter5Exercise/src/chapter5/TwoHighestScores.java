package chapter5;

import java.util.Scanner;

public class TwoHighestScores {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		input = new Scanner(System.in);

		int count = 0;
		int max = 0;
		int second = 0;
		String highestStudent = "";
		String secondStudent = "";

		while (count < students) {
			System.out.print("Enter the student's name: ");
			String name = input.nextLine();
			input = new Scanner(System.in);

			System.out.print("Enter the student's score: ");
			int score = input.nextInt();
			input = new Scanner(System.in);
			
			if (score > max) {
				max = score;
				secondStudent = highestStudent;
				highestStudent = name;
			} else if (score > second) {
				secondStudent = name;
			}
			count++;
		}

		System.out.println("The student with the highest score is " + highestStudent);
		System.out.println("The student with the second highest score is " + secondStudent);
	}
}
