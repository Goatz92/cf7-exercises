package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerAppRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        long result = 0;
        a = in.nextInt();
        n = in.nextInt();
        result = power(a, n);
        System.out.printf("%,d", Math.abs(result));
    }
    public static long power (int a, int n) {
//        if (n == 0) return 1;
//        return power(a,n-1) * a;
        return (n <= 1) ? 1 : power(a, n-1) * a;
    }
}
