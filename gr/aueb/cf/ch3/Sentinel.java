package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives count
 */
public class Sentinel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum = 0;
        System.out.println("Please input a number");
        inputNum = in.nextInt();
        while (inputNum >= 0){
            positivesCount++;
            System.out.println("Please input a number");
            inputNum = in.nextInt();
        }
        System.out.println("Positives numbers input count is: " + positivesCount);
    }
}