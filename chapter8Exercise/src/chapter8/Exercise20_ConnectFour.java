package chapter8;

import java.util.Scanner;

public class Exercise20_ConnectFour {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		char[][] matrix = new char[6][7];
		int counter = 0;
		for (;;) {
			if(counter == 42) break;
			counter += 2;
			
			int col;
			displayBoard(matrix);

			// Prompt user to drop red disk
			System.out.print("Drop a red disk at column (0-6): ");
			col = input.nextInt();
			dropDisk(matrix, col, 'R');

			if (hasWon(matrix)) {
				displayBoard(matrix);
				System.out.println("The Red player won");
				break;
			}

			displayBoard(matrix);
			// Prompt user to drop yellow disk
			System.out.print("Drop a yellow disk at column (0-6): ");
			col = input.nextInt();
			dropDisk(matrix, col, 'Y');

			if (hasWon(matrix)) {
				displayBoard(matrix);
				System.out.println("The yellow player won");
				break;
			}
		}
	}

	public static void dropDisk(char[][] m, int col, char disk) {
		for (int i = m.length - 1; i >= 0; i--) {
			if (m[i][col] == '\u0000') {
				m[i][col] = disk;
				return;
			}
		}
	}

	public static boolean hasWon(char[][] m) {
		// Check rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length - 3; j++) {
				char temp = m[i][j];
				if (temp != '\u0000' && temp == m[i][j + 1] && temp == m[i][j + 2] && temp == m[i][j + 3])
					return true;
			}
		}

		// Check columns
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length - 3; j++) {
				char temp = m[j][i];
				if (temp != '\u0000' && temp == m[j + 1][i] && temp == m[j + 2][i] && temp == m[j + 3][i])
					return true;
			}
		}

		return false;
	}

	public static void displayBoard(char[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print("| " + m[i][j] + " ");
			System.out.print("|\n");
		}
		System.out.println("------------------------------");
	}
}
