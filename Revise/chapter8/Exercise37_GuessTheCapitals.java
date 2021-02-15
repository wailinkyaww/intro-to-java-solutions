package chapter8;

import java.util.Scanner;

public class Exercise37_GuessTheCapitals {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        String[][] stateAndCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"}
        };

        int correctCount = 0;
        for (int i = 0, length = stateAndCapitals.length; i < length; i++) {
            System.out.print("What is the capital of " + stateAndCapitals[i][0]);
            String capital = input.next();
            if (capital.equalsIgnoreCase(stateAndCapitals[i][1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + stateAndCapitals[i][1]);
            }
        }

        System.out.println("The correct count is " + correctCount);
    }
}
