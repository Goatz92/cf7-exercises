package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] arrCopy = arrDeepCopy(arr);
        for (int el : arr){
            System.out.print(el + " ");
        }
        System.out.println(); //prints the values each pos. in original array multiplied by 10
        for (int j = 0; j < arrCopy.length; j++) {
            arrCopy[j] *= 10;
            System.out.print(arrCopy[j] + " ");
        }
    }

    /**
     * Gets a fresh copy of an array
     * @param source    the source array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy (int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
