package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of the digits of an integer
 * ex.: 123 is 6
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int num = 0;
        System.out.println("Enter a positive integer");
        inputNum = in.nextInt();
        num = inputNum;
        while (inputNum > 0){
            sum = sum + inputNum % 10;
            inputNum = inputNum / 10;
        }
        System.out.printf("The sum of the digits of the number: %d is: %d", num, sum);
        //Teacher Version
        //        num = inputNum;
        //        while (inputNum > 0){
        //            rightDigit = inputNum % 10;
        //            sum += rightDigit; //sum = sum + rightDigit
        //            inputNum /= 10;
    }
}
