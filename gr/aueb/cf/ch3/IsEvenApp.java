package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if an integer is an even number.
 */
public class IsEvenApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;
        System.out.println("Please insert an integer");
        num = in.nextInt();
        isEven = num % 2 == 0; // Checks if a number is even.
        System.out.printf("%d is even: %b", num, isEven);
    }
}