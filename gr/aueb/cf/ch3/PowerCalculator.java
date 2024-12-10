package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates b^power
 */
public class PowerCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;
        System.out.println("Please enter your base number");
        base = in.nextInt();
        System.out.println("Please enter the power of the base number");
        power = in.nextInt();
        while (i <= power){
            result *= base;
            i++;
        }
        System.out.printf("Result: %d ^ %d = %,d", base, power, result);
    }
}
