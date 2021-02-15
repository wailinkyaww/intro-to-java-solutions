package chapter2;

import java.util.Scanner;

public class Exercise04_ConvertPoundsToKilograms {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter pound
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        //  Convert to kilograms
        double kilograms = pounds * 0.454;

        //  Display result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
