/**
 * Demonstrates the Bitwise XOR (^) operator.
 *
 * XOR compares each bit of two numbers.
 * Result bit is 1 if the bits are DIFFERENT.
 * Result bit is 0 if the bits are SAME.
 */
public class BitwiseXOR {

    /**
     * Performs bitwise XOR on two integers.
     *
     * @param a first number
     * @param b second number
     * @return result of a ^ b
     */
    public static int xorOperation(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {

        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        /*
         *   0101  (5)
         * ^ 0011  (3)
         * ------
         *   0110  (6)
         *
         * XOR gives 1 only when bits are different.
         */
        int result = xorOperation(a, b);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a ^ b = " + result);
    }
}

