package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed in the console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβληττών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        //Adds num1 + num2 and prints the result
        System.out.println("Το αθροισμα των " + num1 + " , " + num2 + " ειναι ισο με: " + result);
        //%d = decimal =ακεραιος, Inputs an integer that we place after the " in a row
        System.out.printf("το αθροισμα των %d , %d ειναι ισο με: %d" , num1, num2, result);
    }
}
