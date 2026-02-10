/**
 * Demonstrates the Bitwise AND (&) operator.
 *
 * The AND operator compares each bit of two numbers.
 * Result bit is 1 only if BOTH bits are 1.
 */
public class BitwiseAND {

    /**
     * Performs bitwise AND on two integers.
     *
     * @param a first number
     * @param b second number
     * @return result of a & b
     */
    public static int andOperation(int a, int b) {
        return a & b;
    }

    public static void main(String[] args) {

        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        /*
         *   0101  (5)
         * & 0011  (3)
         * ------
         *   0001  (1)
         */
        int result = andOperation(a, b);

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + result);
    }
}
