package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the first left digit of an integer
 * input by the user
 * ex.: 123 -> 1
 */
public class FirstDigitFinder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        System.out.println("Please enter a positive integer");
        inputNum = in.nextInt();
        tempNum = inputNum;
        while (tempNum > 10) {
            tempNum /= 10;
        }
        System.out.printf("The first digit of: %d, is %d", inputNum, tempNum);
    }
}