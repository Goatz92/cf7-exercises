package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User inputs a number.
 * Outputs all the Multiplications
 * From 1 to 10.
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
        int tempNum = 0;
        System.out.println("Please enter a number");
        inputNum = in.nextInt();
        tempNum = inputNum;
        while (i <= 10){
            tempNum = inputNum * i;
            System.out.println(inputNum + "*" + i + "=" + tempNum);
            i++;
        }

        //Teacher Version
        //while (i <= 10) {
        //System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
        //System.out.printf("%d * %2d = %2d\n", inputNum, i, inputNum * i );
        //i++
        //}
    }
}
