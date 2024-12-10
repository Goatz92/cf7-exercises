package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Reverses an integer
 * ex.: 123 -> 321
 */
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempNum = 0;
        System.out.println("Please enter a positive integer");
        inputNum = in.nextInt();
        tempNum = inputNum;
        while (tempNum > 0){
            reversed = reversed * 10 + tempNum % 10;
            tempNum /= 10;
        }
        System.out.printf("The reversed number of %d is: %d", inputNum, reversed);
    }
}
