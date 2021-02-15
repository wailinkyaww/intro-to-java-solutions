package chapter8;

import java.util.Scanner;

public class Exercise35_LargestBlock {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();

        // Create a matrix with specified size and fill with random 0s and 1s
        int[][] matrix = new int[size][size];
//        fillRandomOnesZeros(matrix);

        System.out.println("Enter the matrix row by row: ");
        getMatrix(matrix,input);

        displayMatrix(matrix);

        int[] submatrix = findLargestBlock(matrix);
        System.out.printf("%s ( %d, %d ) with size %d", "The maximum square submatrix is at ", submatrix[0], submatrix[1], submatrix[2]);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0, rowLength = matrix.length; i < rowLength; i++) {
            for (int j = 0, colLength = matrix[i].length; j < colLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getMatrix(int[][] matrix, Scanner input) {
        for (int i = 0, rowLength = matrix.length; i < rowLength; i++) {
            for (int j = 0, colLength = matrix[i].length; j < colLength; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static void fillRandomOnesZeros(int[][] matrix) {
        // Generate random 0s and 1s
        for (int i = 0, rowLength = matrix.length; i < rowLength; i++) {
            for (int j = 0, colLength = matrix[i].length; j < colLength; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static int[] findLargestBlock(int[][] m) {
        // set up an auxiliary array
        int[][] s = new int[m.length][m[0].length];

        // copy over the first column from m
        for (int i = 0; i < s.length; )
            s[i][0] = m[i++][0];

        // copy over the first row from m
        for (int i = 0; i < s[0].length; )
            s[0][i] = m[0][i++];

        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    s[i][j] = Math.min(s[i][j - 1], Math.min(s[i - 1][j], s[i - 1][j - 1])) + 1;
                } else {
                    s[i][j] = 0;
                }
            }
        }

        // find the largest value and its coordinates in the aux array
        int largest = -1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j] > largest) {
                    largest = s[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        // Calculate the coordinates of the upper-left corner of the submatrix
        x -= (largest - 1);
        y -= (largest - 1);

        // return the coordinates and sub-matrix size, in that order
        return new int[]{x, y, largest};
    }
}
