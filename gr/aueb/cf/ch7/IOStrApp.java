package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");

        s1 = in.next();     //Reads until it finds a White space (spaces, tabs, new lines)
        s2 = in.nextLine(); //Reads everything until it finds new line (enter)

        System.out.printf("s1 %s\n", s1);
        System.out.printf("s2 %s\n", s2);
    }
}
