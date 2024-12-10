package gr.aueb.cf.ch3;

import javax.swing.*;
import java.util.Scanner;

/**User inputs a temperature
 * Print if the temp is equal to, lower or higher than 0
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;
        System.out.println("Please insert the current Temperature:");
        temp = in.nextInt();
        isTempBelowZero = temp < 0;
        if (isTempBelowZero){
            System.out.println("The temperature is below zero");
        }else if(temp == 0)
        {
            System.out.println("The temperature is zero");
        }else{
            System.out.println("The temperature is above zero");
        }
    }
}
