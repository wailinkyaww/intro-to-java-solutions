package chapter8;

import java.util.Scanner;

public class Exercise36_LatinSquare {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter n
        System.out.print("Enter number n: ");
        int n = input.nextInt();

        // Create a matrix to store letters
        char[][] letters = new char[n][n];

        System.out.println("Enter 4 rows of letters separated by spaces: ");
        getLetters(letters, input);

        if (isValidLatinSquare(letters))
            System.out.println("The input array is a Latin square");
        else
            System.out.println("The input array is not a Latin square");
    }

    // Get letters
    public static void getLetters(char[][] letters, Scanner input) {
        for (int i = 0, rowLength = letters.length; i < rowLength; i++) {
            for (int j = 0, colLength = letters[i].length; j < colLength; j++)
                letters[i][j] = input.next().charAt(0);
            isLettersInRange(letters[i]);
        }
    }

    public static boolean isLettersInRange(char[] letters) {
        for (int i = 0, length = letters.length; i < length; ) {
            char maxChar = (char) ('A' + length - 1);
            if (letters[i] < 'A' || letters[i++] > maxChar) {
                System.out.println("Wrong input: the letters must be from A to " + maxChar);
                System.exit(1);
            }
        }
        return true;
    }

    public static boolean isValidLatinSquare(char[][] letters) {
        /**
         * Check if unique value in each rows
         * assume n x n matrix
         */
        for (int i = 0, length = letters.length; i < length; i++) {
            for (int j = i; j < length; j++) {
                int currentChar = letters[i][j];
                for (int k = j + 1; k < length; k++) {
                    if (letters[j][k] == currentChar || letters[k][j] == currentChar)
                        return false;
                }
            }
        }

        return true;
    }
}
