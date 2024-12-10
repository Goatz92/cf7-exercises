package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Prints a menu
 * user chooses a menu item
 * and then an action is executed
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = in.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }
            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Choose one:");
        System.out.println("1. Create");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >=1 && choice <=5;
    }
    public static void doOnChoice (int choice) {
        switch (choice) {
            case 1:
                System.out.println("1. Creating...");
                break;
            case 2:
                System.out.println("2. Deleting...");
                break;
            case 3:
                System.out.println("3. Searching...");
                break;
            case 4:
                System.out.println("4. Updating...");
                break;
            case 5:
                System.out.println("5. Exiting...");
                break;
            default:
                System.out.println("Wrong Choice.");
                break;
        }
    }
}
