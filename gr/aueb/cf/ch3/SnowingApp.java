package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining && temp <0
 */
public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;
        System.out.println("Please insert if it is raining.");
        isRaining = in.nextBoolean();
        System.out.println("Please Enter current temperature.");
        temp = in.nextInt();
        isSnowing = isRaining && temp < 0;
        System.out.println("Is snowing: " + isSnowing);
    }
}
