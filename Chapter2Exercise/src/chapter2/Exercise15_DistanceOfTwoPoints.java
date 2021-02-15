package chapter2;

import java.util.Scanner;

public class Exercise15_DistanceOfTwoPoints {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        double x1, y1, x2, y2, distance;

        // Prompt user to enter the coordinates of points
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        // Calculate distance between two points
        distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        System.out.println("The distance between two points is " + distance);
    }
}
