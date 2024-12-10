package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the sum of integers
 * via method usage.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;
        System.out.println("Please input two integers");
        a = in.nextInt();
        b = in.nextInt();
        sum = add(a,b);
        sub = sub(a,b);
        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the sum
     */
    public static int add(int a, int b) {
//        int result  = 0;
//        result  = a + b;
//        return result;
        return a + b;
    }

    /**
     * Subtracts two integers
     * @param a the first integer
     * @param b the second integer
     * @return the subtraction of a - b.
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}