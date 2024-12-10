package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearize the branches and checks
 * errors first.
 */
public class SecretFinderErrorHandling {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int inputNum = 0;
        while (true){
            System.out.println("Insert a number to guess the Secret Number");
            inputNum = in.nextInt();
            if (inputNum != SECRET){
                System.out.println("Try Again");
                continue;
            }
            System.out.println("You are the Best!!");
            break;
        }
    }
}
