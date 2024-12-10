package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Throughout demo of for.
 */
public class FlexibleFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startVal = 0;
        int endVal = 0;
        int step;
        int iterations = 0;
        System.out.println("Please enter start, end, step");
        startVal = in.nextInt();
        endVal = in.nextInt();
        step = in.nextInt();
        for (int i  =startVal; i <= endVal; i += step) {
            iterations++;
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}