package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {

    public static void main(String[] args) {

        //Declarations and Initializations

        BigInteger bigNum1 = new BigInteger("12345689234132480932184132048");
        BigInteger bigNum2 = new BigInteger("123421421484120984092184049821");
        BigInteger result;
        //Commands

        result = bigNum1.add(bigNum2);

        //Printing the results

        System.out.printf("%,d" , result);
        // BigIntegers are integers bigger than the numbers that we can save in RAM
    }
}