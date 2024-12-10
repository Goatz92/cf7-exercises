package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * There is a secret number
 * and user tries to find it
 * by inputing different integers
 * with only one try.
 */
public class SecretFinder {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int inputNum = 0;
        System.out.println("Insert a number to guess the Secret Number");
        inputNum = in.nextInt();
        if (inputNum == SECRET){
            System.out.println("Secret Found!!");
        } else { // num != SECRET
            System.out.println("You have Dishonored your Famiru");
        }
    }
}
