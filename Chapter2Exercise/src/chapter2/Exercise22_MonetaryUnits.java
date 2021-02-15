package chapter2;

import java.util.Scanner;

public class Exercise22_MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount as an Integer, for example 1156 for 11.56:");
        int amount = input.nextInt();
        int remainingAmount = amount;

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;
        remainingAmount %= 5;

        System.out.println("Your amount " + amount + " cents consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
        System.out.println("    " + remainingAmount + " cents");
    }
}
