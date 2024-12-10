package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on,
 * if it is raining && car is running > 100
 * or || is dark
 */
public class LightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isSpeeding = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        int speed = 0;
        System.out.println("Please input if it is raining");
        isRaining = in.nextBoolean();
        System.out.println("Please input integer for current speed");
        speed = in.nextInt();
        isSpeeding = speed > MAX_CAR_SPEED;
        System.out.println("Please enter if it is dark");
        isDark = in.nextBoolean();
        areLightsOn = isRaining && (isSpeeding || isDark);
        System.out.println("Lights are on: " + areLightsOn);
    }
}
