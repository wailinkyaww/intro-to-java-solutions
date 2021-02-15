package chapter2;

import java.util.Scanner;

public class Exercise03_ConvertFeetIntoMeters {
    public static void main(String[] args) {
        //  Creating a Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        //  Convert to Meters
        double meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
