package chapter7;

import java.util.Scanner;

public class Exercise04_AnalyzeScore {
	public static void main(String[] args) {
		int[] scores = new int[100];

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			if (scores[i] < 0)
				break;
		}

		double average = getAverage(scores);

		int belowCount = 0, equalCount = 0, aboveCount = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 0)
				break;
			if (scores[i] > average)
				aboveCount++;
			else if (scores[i] == average)
				equalCount++;
			else
				belowCount++;
		}

		System.out.println("The average is " + average);
		System.out.println("Number of elements above average score: " + aboveCount);
		System.out.println("Number of elements equal to average score: " + equalCount);
		System.out.println("Number of elements below  average score: " + belowCount);
	}

	public static double getAverage(int[] scores) {
		double sum = 0;
		int i = 0;
		for (; i < scores.length; i++) {
			if (scores[i] < 0)
				break;
			sum += scores[i];
		}

		double average = sum / i;

		return average;
	}
}
