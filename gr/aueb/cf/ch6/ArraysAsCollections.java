package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 22, 7, 9, 10, 2, 3, 5, 6, 12};
        int[] mapped = mapToDouble(arr);
        int[] arrEven = getEvens(arr);
        int sum = arraySum(arr);
        double average = average(arr);

        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int el : arrEven) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (int el : mapped) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(sum);
        System.out.printf("%.2f", average);
        System.out.println();
        if (anyEven(arr)) {
            System.out.println("Found at least one even number");
        }
        if (moreThanTwoEven(arr)) {
            System.out.println("Found more than two Even numbers");
        }
        if (moreThanTwoWithSameEnding(arr)) {
            System.out.println("Found more than two numbers with the same ending");
        }
        if (threeConsecutive(arr)) {
            System.out.println("Found three consecutive numbers");
        }
        if (allAreEven(arr)){
            System.out.println("All numbers in array are even");
        } else {
            System.out.println("Not all numbers in array are even");
        }
    }

    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        int[] evens = new int[count]; //Sets the dimension of the array of evens
        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }

    public static int[] mapToDouble(int[] arr) {

        int[] mapped = new int[arr.length];
        for (int i = 0; i < mapped.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int arraySum(int[] arr) {

        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double average(int[] arr) {

        int sum = 0;
        double average = 0;
        for (int el : arr) {
            sum += el;
        }
        average = (double) sum / arr.length;
        return average;
    }

    public static boolean anyEven(int[] arr) {

        boolean foundOne = false;
        for (int el : arr) {
            if (el % 2 == 0) {
                foundOne = true;
                break;
            }
        }
        return foundOne;
    }
    public static boolean moreThanTwoEven (int[] arr) {

        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        if (count > 2) {
        }
        return count > 2;
    }
    public static boolean threeConsecutive (int[] arr) {

        int count = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] == arr[i - 1] - 1 && arr[i] == arr[i - 2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }
    public static boolean moreThanTwoWithSameEnding (int[] arr) {

        int[] endings = new int[10];
        boolean isSameEnding = false;
        for (int num : arr) {
            endings[num % 10]++;
        }

//Alternate Version written explicitly
//
//        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int count : endings)
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        return isSameEnding;
    }

    public static boolean allAreEven (int[] arr) {

        boolean allEven = false;
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
