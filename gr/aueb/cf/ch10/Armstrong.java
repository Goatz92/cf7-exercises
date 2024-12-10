package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1 ^ 3 + 5 ^ 3 + 3 ^ 3
 */
public class Armstrong {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNum = 0;
        int sum = 0;
//        int temp = 0;     see todo
        int originalNum;
        int numberOfDigits = 0;
        int digit;
//        int [] arr = new int [numberOfDigits];        see todo

        inputNum = in.nextInt();

        numberOfDigits = String.valueOf(inputNum).length(); //ValueOf transforms a primitive to a String

        originalNum = inputNum;

        while (inputNum != 0) {
            digit = inputNum % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            inputNum /= 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is " : " is not ");
    }

//TODO Try to find a way to transfer each digit in the array.

}


