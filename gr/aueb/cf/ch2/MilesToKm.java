package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts miles to KM
 */
public class MilesToKm {

    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometers = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert Miles to be converted");
        inputMiles = in.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;
        System.out.println("Miles: " + inputMiles + ", Km: " + kilometers);
        System.out.printf("%f Miles are equal to %f Km", inputMiles, kilometers);
    }
}
