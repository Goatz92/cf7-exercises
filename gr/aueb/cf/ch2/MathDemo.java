package gr.aueb.cf.ch2;

import java.lang.*;;

/**Math Class demo
 *
 */
public class MathDemo {
    public static void main(String[] args) {

        System.out.println("Το απόλυτο του -5 ειναι: " + Math.abs(-5));
        System.out.println("Το min του 3, 19 ειναι: " + Math.min(3, 19));
        System.out.println("Το max του -5, 299 ειναι: " + Math.max(-5, 299));

        int num1 = 0, num2 = 1, sum;
        sum = num1 + num2;
        System.out.println(num1 + num2 + sum);
    }
}
