package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i <= arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        //Will throw RuntimeException if {
        //        int[] arr = new int[10];
        //        for (int i = 0; i <= arr.length; i++){
        //            System.out.println(arr[i] + " ");
        //        }
        //Coding error @ "i <= arr.length; can not be equal to arr.length
        //cause index out of bounds
    }
}
