/**
 * Demonstrates the Bitwise OR (|) operator.
 *
 * The OR operator compares each bit of two numbers.
 * Result bit is 1 if AT LEAST ONE of the bits is 1.
 */
public class BitwiseOR {

    /**
     * Performs bitwise OR on two integers.
     *
     * @param a first number
     * @param b second number
     * @return result of a | b
     */
    public static int orOperation(int a, int b) {
        return a | b;
    }

    public static void main(String[] args) {

        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        /*
         *   0101  (5)
         * | 0011  (3)
         * ------
         *   0111  (7)
         *
         * OR gives 1 if either bit is 1.
         */
        int result = orOperation(a, b);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a | b = " + result);
    }
}

