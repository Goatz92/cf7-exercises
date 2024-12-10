package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Converts days, hours, minutes, seconds
 * to total seconds
 * User inputs data and prints the final result
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        //My Version
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input integers for Days");
        days = in.nextInt();
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;

        System.out.printf("In %d day/days there are %,d hrs %,d minutes and %,d seconds", days, hours, minutes, seconds);
//        System.out.println(`In ${days} days there are ${hours} hrs....`);

        //Teacher Version
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        Scanner input = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        int totalSeconds = 0;

        System.out.println("\nPlease insert days, hours, minutes, seconds");
        inputDays = input.nextInt();
        inputHours = input.nextInt();
        inputMinutes = input.nextInt();
        inputSeconds = input.nextInt();

        totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR +
                inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf("Total Seconds are %,d\n", totalSeconds);
    }
}
