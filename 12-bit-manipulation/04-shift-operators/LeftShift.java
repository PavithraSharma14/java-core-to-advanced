/**
 * Demonstrates Left Shift (<<) operator.
 *
 * Left shift moves all bits to the left by given positions.
 * Zeros are filled on the right.
 *
 * Equivalent to multiplying by 2^n (for positive numbers).
 */
public class LeftShift {

    /**
     * Performs left shift.
     *
     * @param num input number
     * @param positions number of positions to shift
     * @return result after shifting
     */
    public static int leftShift(int num, int positions) {
        return num << positions;
    }

    public static void main(String[] args) {

        int num = 5; // binary: 0000 0101

        /*
         * 5 << 1
         *
         * 0000 0101
         * becomes
         * 0000 1010  -> 10
         *
         * 5 * 2^1 = 10
         */

        int result = leftShift(num, 1);

        System.out.println("Number = " + num);
        System.out.println("After left shift = " + result);
    }
}
