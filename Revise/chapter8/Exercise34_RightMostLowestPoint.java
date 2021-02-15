package chapter8;

import java.util.Scanner;

public class Exercise34_RightMostLowestPoint {
    public static void main(String[] args) {

        double[][] points = new double[6][2];

        // Prompt user to enter 6 points
        System.out.print("Enter 6 points: ");
        getPoints(points);

        double[] rightMostLowestPoint = getRightmostLowestPoint(points);

        // Display result
        System.out.printf("%s ( %.1f , %.1f )", "The rightmost lowest point is", rightMostLowestPoint[0], rightMostLowestPoint[1]);

    }

    public static void getPoints(double[][] points) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        sortPoints(points);
        return points[0];
    }

    public static void sortPoints(double[][] points) {
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < points.length - 1; i++) {
                if (points[i + 1][1] <= points[i][1]) {
                    if (points[i + 1][0] < points[i][0]) {
                        continue;
                    }
                    double[] temp = points[i + 1];
                    points[i + 1] = points[i];
                    points[i] = temp;
                    changed = true;
                }
            }
        } while (changed);
    }
}
