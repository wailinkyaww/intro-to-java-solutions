package chapter2;

import java.util.Scanner;

public class Exercise01_ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter celsius degree
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        //  Convert celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        //  Display result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
