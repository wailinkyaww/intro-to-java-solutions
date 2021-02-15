package chapter2;

import java.util.Scanner;

public class Exercise12_FindingRunwayLength {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble(), acceleration = input.nextDouble();

        //  Calculate length
        double length = Math.pow(speed, 2) / (2 * acceleration);

        //  Display results
        System.out.println("The minimum run away length for this airplane is " +
                (int) ((length + 0.0005) * 1000) / 1000.0);
    }
}
