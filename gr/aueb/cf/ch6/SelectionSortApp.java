package gr.aueb.cf.ch6;



public class SelectionSortApp {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[] {7, 10, 4, 5, 9, 16};
        for (int j : arr) { //Simplified form below
            System.out.print(j + " ");
        }
        System.out.println();

        int[] arrCopy = selectionSort(arr);

        for (int j : arrCopy) { //Simplified form below
            System.out.print(j + " ");
        }
    }

    public static int[] selectionSort (int[] arr) {


        //Find min
        for (int i = 0; i < arr.length - 1; i++){
            int minPosition = i;
            int minValue = arr[minPosition];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            //Swap (minPos, i)
            swap(arr, minPosition, i);
        }
        return arr;
    }
    public static void swap (int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
