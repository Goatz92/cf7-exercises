package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Please insert an integer");
        num = in.nextInt();
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));
    }

    public static boolean isEven (int num) {
        return (num % 2 == 0);
    }

    public static boolean isOdd (int num) {
        return !isEven(num);
    }
}
