package chapter8;

import java.util.Scanner;

public class Exercise09_TicTacToeGame {
	public static void main(String[] args) {
		char[][] grid = new char[3][3];

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int status = 0;

		while (true) {
			int row = 0, col = 0;
			displayBoard(grid);

			System.out.print("Enter a row(0, 1, or 2) for player X: ");
			row = input.nextInt();
			System.out.print("Enter a column(0, 1, or 2) for player X: ");
			col = input.nextInt();
			grid[row][col] = 'X';
			
			status = checkBoard(grid);
			if(status != 0) break;
			
			displayBoard(grid);

			System.out.print("Enter a row(0, 1, or 2) for player O: ");
			row = input.nextInt();
			System.out.print("Enter a column(0, 1, or 2) for player O: ");
			col = input.nextInt();
			grid[row][col] = 'O';
			status = checkBoard(grid);
			if(status != 0) break;
		}

		displayBoard(grid);
		if(status == 1)
			System.out.print("X player won");
		else if(status == 2)
			System.out.println("O player won");
		else
			System.out.println("It is a draw");
	}

	// Assume n x n matrix
	public static int checkBoard(char[][] grid) {
		// 0 for continue, 1 for X win, 2 for O win, 3 for draw

		// Check horizontally
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][0] == 'X' && grid[i][1] == 'X' && grid[i][2] == 'X')
				return 1;
			else if (grid[i][0] == 'O' && grid[i][1] == 'O' && grid[i][2] == 'O')
				return 2;
		}

		// Check vertically
		for (int i = 0; i < grid.length; i++) {
			if (grid[0][i] == 'X' && grid[1][i] == 'X' && grid[2][i] == 'X')
				return 1;
			else if (grid[0][i] == 'O' && grid[1][i] == 'O' && grid[2][i] == 'O')
				return 2;
		}

		// Check diagonal
		if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]) {
			if (grid[0][0] == 'X')
				return 1;
			return 2;
		}

		int status = 3;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == '\u0000') {
					status = 0;
					break;
				}
			}
		}

		return status;
	}

	public static void displayBoard(char[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println("-------------");
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print("| " + grid[i][j] + " ");
			}
			System.out.print("| \n");
		}
		System.out.println("-------------");
	}

}
