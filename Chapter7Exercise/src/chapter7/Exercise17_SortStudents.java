package chapter7;

import java.util.Scanner;

public class Exercise17_SortStudents {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of students
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();

		input = new Scanner(System.in);

		int[] scores = new int[n];
		String[] names = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the student's name: ");
			names[i] = input.nextLine();

			input = new Scanner(System.in);

			System.out.print("Enter the student's score: ");
			scores[i] = input.nextInt();

			input = new Scanner(System.in);
		}

		sortArraysByScore(scores, names);
		printArray(names);

	}

	public static void printArray(String[] names) {
		int i;
		for (i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}

	public static void sortArraysByScore(int[] list, String[] names) {
		for (int i = 0; i < list.length; i++) {
			int currentMax = list[i];
			int currentMaxIndex = i;
			String currentStudent = names[i];

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentStudent = names[j];
					currentMaxIndex = j;
				}
			}

			if (currentMaxIndex != i) {
				names[currentMaxIndex] = names[i];
				names[i] = currentStudent;

				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

}
