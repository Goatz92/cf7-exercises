package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double amount = 0.0;
        System.out.println("Your Current Balance is: " + balance);
        System.out.println("Please insert the amount you want to deposit");
        amount = in.nextDouble();
        deposit(amount);
        System.out.println("Your new Balance is: " + balance);
    }

    public static void deposit (double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be Positive");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
