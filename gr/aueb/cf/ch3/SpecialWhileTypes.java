package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Special forms of whiel
 */
public class SpecialWhileTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int num;

        while ((num = in.nextInt()) >=0);

        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }
        while (i < 1){
            System.out.println("Never gets in");
            i++;
        }
        while (i <= 1){
            System.out.println("Gets in once");
            i++;
        }
        while(true) {
            System.out.println("Eternal Loop");
        }

    }
}
