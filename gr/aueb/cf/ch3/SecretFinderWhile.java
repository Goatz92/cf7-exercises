package gr.aueb.cf.ch3;

/**
 * There is a secret number
 * and user tries to find it
 * by inputing different integers
 * multiple tries.
 */
import java.util.Scanner;

public class SecretFinderWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int inputNum = 0;
        boolean isSuccess = false;
        do {
            System.out.println("Insert a number to guess the Secret Number");
            inputNum = in.nextInt();
            if (inputNum == SECRET){
                System.out.println("Secret Found!!");
                isSuccess = true;
            } else { // num != SECRET
                System.out.println("Please try again");
            }
        } while(!isSuccess);
    }
}
