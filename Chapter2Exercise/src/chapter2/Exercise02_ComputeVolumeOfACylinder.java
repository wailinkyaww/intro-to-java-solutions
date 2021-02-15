package chapter2;

import java.util.Scanner;

public class Exercise02_ComputeVolumeOfACylinder {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;

        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user for radius and length
        System.out.print("Enter radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        //  Compute area and volume
        double area = radius * radius * PI;
        double volume = area * length;

        /**
         * Display results
         * +0.05 is for rounding one decimal place
         */
        System.out.println("The are is " + (int)(area * 10000) / 10000.0);
        System.out.println("The volume is " + (int)((volume + 0.05) * 10) / 10.0);
    }
}
