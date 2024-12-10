package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch / case.
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Make a choice: ");
            System.out.println("1. One-Player game");
            System.out.println("2. Two-Player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            choice = in.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Choice must be between 1-4.");
                System.out.println("Choose Again");
                continue;
            }
//            if (choice == 1) {
//                System.out.println("One-Player game starting");
//            } else if (choice == 2) {
//                System.out.println("Two-Player game starting");
//            } else if (choice == 3) {
//                System.out.println("Team game starting");
//            } else {
//                System.out.println("Shutting down...");
//            }
            switch (choice) {
                case 1:
                    System.out.println("One-Player game starting");
                    break;
                case 2:
                    System.out.println("Two-Player game starting");
                    break;
                case 3:
                    System.out.println("Team game starting");
                    break;
                case 4:
                    System.out.println("Shutting down...");
                    break;
            }
        } while (choice != 4);
    }
}
