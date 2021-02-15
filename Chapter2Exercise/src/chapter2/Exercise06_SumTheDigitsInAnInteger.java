package chapter2;

import java.util.Scanner;

public class Exercise06_SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter a value
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        //  Calculate Summation of digits
        int sum = number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;

        //  Display result
        System.out.println("The sum of the digits is " + sum);
    }
}
