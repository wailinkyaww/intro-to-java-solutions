package chapter2;

import java.util.Scanner;

public class Exercise14_ComputeBMI {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237,
                METERS_PER_INCH = 0.0254;

        // Prompt user to enter weight and height
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        weight *= KILOGRAMS_PER_POUND;
        height *= METERS_PER_INCH;

        // Calculate Body Mass Index
        double bmi = weight / Math.pow(height, 2);

        System.out.print("BMI is " + (int) ((bmi + 0.00005) * 10000) / 10000.0);
    }
}
