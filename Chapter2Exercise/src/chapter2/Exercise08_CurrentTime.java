package chapter2;

import java.util.Scanner;

public class Exercise08_CurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the time zone offset
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        currentHour += offset;

        // Display result
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
