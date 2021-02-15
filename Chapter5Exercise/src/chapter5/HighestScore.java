package chapter5;

import java.util.Scanner;

public class HighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		input = new Scanner(System.in);

		int count = 0;
		int max = 0;
		String studentName = "";

		while (count < students) {
			System.out.print("Enter the student's name: ");
			String name = input.nextLine();
			input = new Scanner(System.in);

			System.out.print("Enter the student's score: ");
			int score = input.nextInt();
			input = new Scanner(System.in);

			if (score > max) {
				max = score;
				studentName = name;
			}

			count++;
		}

		System.out.println("The name of the student with the highest score is " + studentName);
	}
}
