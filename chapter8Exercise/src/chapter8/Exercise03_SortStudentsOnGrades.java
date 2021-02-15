package chapter8;

public class Exercise03_SortStudentsOnGrades {
	public static void main(String[] args) {
		// Students' answers to each question
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		// Declare an array to store students' grades
		int[][] records = new int[answers.length][2];

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					records[i][0] = i;
					records[i][1]++;
				}
			}

		}

		// Sort in increasing order of number of correct answers
		sortByGrades(records);

		// Display results
		for (int i = 0; i < records.length; i++)
			System.out.println("Student " + records[i][0] + "'s correct count is " + records[i][1]);
	}

	// Sort the correct counts record by grades
	public static void sortByGrades(int[][] r) {
		for (int i = 0; i < r.length; i++) {
			int currentMinStudent = r[i][0];
			int currentMinGrade = r[i][1];
			int currentMinIndex = i;
			for (int j = i + 1; j < r.length; j++) {
				if (currentMinGrade > r[j][1]) {
					currentMinStudent = r[j][0];
					currentMinGrade = r[j][1];
					currentMinIndex = j;
				}
			}

			// Swap
			if (currentMinIndex != i) {
				r[currentMinIndex][0] = r[i][0];
				r[currentMinIndex][1] = r[i][1];
				r[i][0] = currentMinStudent;
				r[i][1] = currentMinGrade;
			}
		}
	}

}
