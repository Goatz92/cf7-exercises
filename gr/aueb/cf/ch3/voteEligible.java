package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if user is eligible to vote
 * depending on age. (>18)
 */
public class voteEligible {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int ELIGIBLE_AGE = 18;
        int age = 0;
        boolean isELigible = false;
        System.out.println("Please enter your age");
        age = in.nextInt();
        isELigible = age >= ELIGIBLE_AGE;
        System.out.printf("Eligible for vote: %b\nMinimum voting age is %d.", isELigible, ELIGIBLE_AGE);
    }
}