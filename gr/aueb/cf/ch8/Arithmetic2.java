package gr.aueb.cf.ch8;

public class Arithmetic2 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("This line is executed");
    }
}