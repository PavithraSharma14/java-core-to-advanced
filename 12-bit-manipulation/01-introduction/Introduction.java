/**
 * Introduction to Bit Manipulation
 *
 * Bit manipulation means operating directly on the binary
 * representation of numbers using bitwise operators.
 *
 * Instead of treating numbers as whole values,
 * we work on individual bits (0s and 1s).
 */
public class Introduction {

    public static void main(String[] args) {

        int a = 5;   // binary: 0101
        int b = 3;   // binary: 0011

        /*
         * AND (&)
         * 0101
         * 0011
         * ----
         * 0001 -> 1
         */
        System.out.println("AND (&): " + (a & b));

        /*
         * OR (|)
         * 0101
         * 0011
         * ----
         * 0111 -> 7
         */
        System.out.println("OR (|): " + (a | b));

        /*
         * XOR (^)
         * 0101
         * 0011
         * ----
         * 0110 -> 6
         */
        System.out.println("XOR (^): " + (a ^ b));

        /*
         * NOT (~)
         * Inverts all bits
         * ~0101 = ...1010 (two's complement representation)
         */
        System.out.println("NOT (~a): " + (~a));

        /*
         * Left Shift (<<)
         * 5 << 1 = 1010 (10)
         * Equivalent to multiplying by 2
         */
        System.out.println("Left Shift (a << 1): " + (a << 1));

        /*
         * Right Shift (>>)
         * 5 >> 1 = 0010 (2)
         * Equivalent to dividing by 2
         */
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}

