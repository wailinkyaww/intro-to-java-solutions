package chapter12;

import java.io.File;
import java.io.PrintWriter;

public class Exercise24_CreateLargeDataset {

	// Ranks and salary ranges for each professor
	private static String[] ranks = { "assistant", "associate", "full" };
	private static double[][] salaryRange = { { 50000, 80000 }, { 60000, 110000 }, { 75000, 1300000 } };

	public static void main(String[] args) throws Exception {
		int rank;
		double salary;

		// Create new File object
		File file = new File("Salary.txt");

		StringBuilder s = new StringBuilder();

		for (int i = 1; i <= 1000; i++) {
			rank = (int) (Math.random() * 3);
			salary = salaryRange[rank][0] + Math.random() * (salaryRange[rank][1] - salaryRange[rank][0]);
			salary = Math.round(salary * 100) / 100.0;

			s.append("FirstName" + i + " ");
			s.append("LastName" + i + " ");
			s.append(ranks[rank] + "\t");
			s.append(salary + "\n");
			System.out.println(s);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print(s);
		output.close();
	}

}
