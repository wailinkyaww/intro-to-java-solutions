package chapter2;

import java.util.Scanner;

public class Exercise21_CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        double investmentAmount, annualInterestRate,
                monthlyInterestRate, futureInvestmentValue;
        int numberOfYears;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();

        futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,numberOfYears * 12);

        System.out.println("Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
