package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Prints a menu of choices:
 * (Add, sub etc.)
 * User makes a choice
 * Executes the calculation
 * and prints the result.
 * Runs continuously until user chooses Exit
 */
public class Calculator {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        int result = 0;
        while (true) {
            printMenu();
            choice = getOneInt ();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6");
                System.out.println("Try Again!");
                continue;
            }
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            result = getResultOnChoice (choice);
            System.out.println("Result: " + result);
        }
    }
    public static void printMenu () {
        System.out.println("Choose one:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
    }
    public static int getOneInt () {
        return in.nextInt();
    }
    public static boolean isChoiceValid (int choice) {
//        if (choice >= 1 && choice <= 6) {
//            return true;
//        } else {
//            return false;
//        }
        return choice >= 1 && choice <= 6;
    }
    public static int getResultOnChoice (int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        System.out.println("Please insert two integers");
        num1 = getOneInt();
        num2 = getOneInt();
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int sub (int a, int b) {
        return a - b;
    }

    public static int mul (int a, int b) {
        return a * b;
    }

    public static int div (int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    public static int mod (int a, int b) {
        if (b == 0) return 0;
        System.out.println("Dividend can't be 0");
        return a % b;
    }
}
