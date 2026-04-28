/*
PROBLEM:
Convert number into words using recursion.

APPROACH:
Process digits from left to right using recursion.
Break number using division and modulo.
*/

public class NumberToWords {

    static String[] digits = {
        "zero","one","two","three","four",
        "five","six","seven","eight","nine"
    };

    public static void convert(int n) {
        if (n == 0) {
            return;
        }

        convert(n / 10);

        int lastDigit = n % 10;
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int n = 1947;
        convert(n);
    }
}
