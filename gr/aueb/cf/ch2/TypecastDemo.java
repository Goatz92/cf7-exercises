package gr.aueb.cf.ch2;

/**Typecast demo.
 */
public class TypecastDemo {
    public static void main(String[] args) {
        // Typecast is the conversion between an int to a long, for example:
        int num1 = 10;  //int literals -> int -> 32-bit
        long num2 = 20L;
        // To convert: use (int) to convert a long to int for example.
        num1 = (int) num2;
        long result = num1 + num2;
        System.out.println(result);
    }
}
