package gr.aueb.cf.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Switch-case is fall-through and can be used
 * as a logical OR.
 */
public class SwitchCaseFallThrough {

    public static void main(String[] args) {
        int grade;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your grade");
        grade = in.nextInt();
        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Failed");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
                System.out.println("Excellent");
                break;
            case 10:
                System.out.println("Perfect");
                break;
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
