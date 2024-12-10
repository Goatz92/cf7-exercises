package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως Input από τον χρήστη ένα διψήφιο ακέραιο
 * και να εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα αν ο χρήστης δώσει τον αριθμό 15
 * θα πρέπει το αποτέλεσμα να είναι:
 * 1 + 5 = 6
 */
public class DigitsSum {
    public static void main(String[] args) {

        //My Version

        int inputNum;
        int divNum = 0;
        int modNum = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input an two-digit integer");
        inputNum = in.nextInt();
        divNum = inputNum / 10;
        modNum = inputNum % 10;
        result = divNum + modNum;

        System.out.printf("Το αθροισμα των ψηφιων %d + %d του αριθμου %d ειναι ισο με %d", divNum, modNum, inputNum, result);

        //Teacher Version
        Scanner input = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum1;
        int sum = 0;

        System.out.println("\nPlease insert a two-digit integer");
        inputNum1 = input.nextInt();
        leftDigit = inputNum1 / 10; //Με div 10 παιρνουμε το αριστερο ψηφιο
        rightDigit = inputNum1 % 10; //Με mod 10 παιρνουμε το δεξι ψηφιο
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", inputNum1, leftDigit, rightDigit, sum);
    }
}
