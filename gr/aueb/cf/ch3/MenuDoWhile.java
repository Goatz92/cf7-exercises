package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Show a menu at least once
 */
public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please choose a section");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Αναζήτηση");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
        } while (choice != 5);
        System.out.println("Thanks for using this useless app");
    }
}
