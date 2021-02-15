package chapter8;

public class Exercise04_ComputeWeeklyHours {
	public static void main(String[] args) {
		// Employees' work hours for each day
		int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		// Calculate weekly hours and store with employee
		int[][] weeklyHours = calculateWeeklyHours(workHours);
		sort(weeklyHours);

		// Display results
		for (int i = 0; i < weeklyHours.length; i++) {
			System.out.println("Employee " + weeklyHours[i][0] + "'s weekly hour is " + weeklyHours[i][1]);
		}
	}

	// Calculate total worked hours in a week
	public static int[][] calculateWeeklyHours(int[][] wh) {
		int totalEmployees = wh.length;
		int[][] weeklyHours = new int[totalEmployees][2];

		for (int i = 0; i < totalEmployees; i++) {
			int totalHours = 0;
			for (int j = 0; j < wh[i].length; j++) {
				totalHours += wh[i][j];
			}
			weeklyHours[i][0] = i;
			weeklyHours[i][1] = totalHours;
		}
		return weeklyHours;
	}

	// Sort the values in column 1 in decreasing order
	public static void sort(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int currentMaxEmployee = arr[i][0];
			int currentMaxHour = arr[i][1];
			int currentMaxIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (currentMaxHour < arr[j][1]) {
					currentMaxEmployee = arr[j][0];
					currentMaxHour = arr[j][1];
					currentMaxIndex = j;
				}

			}

			// Check and Swap if need
			if (currentMaxIndex != i) {
				arr[currentMaxIndex][0] = arr[i][0];
				arr[currentMaxIndex][1] = arr[i][1];
				arr[i][0] = currentMaxEmployee;
				arr[i][1] = currentMaxHour;
			}
		}
	}

}
