package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα.
 * Populate an array.
 * - new
 * - unsized init
 * - array initializer
 * - print τα στοιχεία ενός πίνακα.
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];    // Declare and init
        int[] arr2 = {1, 2, 3, 4, 5}; //Unsized init
        int[] arr3;                   //Array initializer. Can be written in two different lines.
        arr3 = new int[] {1, 2, 3, 4, 5};
        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //Traverse
        for (int i = 0; i < arr.length; i++) { //Simplified form below
            System.out.print(arr[i] + " ");
        }

        //Enhanced for
        for (int el : arr3) {
            System.out.println(el + " ");
        }
    }
}
