package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT (24%)
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT = 0.24;
        double price = 0.0;
        double finalprice = 0.0;
        double vatvalue = 0.0;
        System.out.println("Please enter your price");
        price = in.nextDouble();
        vatvalue = price * VAT;
        finalprice = price + vatvalue ;
        System.out.printf("Price: %.2f€, Vat: %.2f, Price with vat: %.2f€", price, VAT, finalprice);
    }
}
