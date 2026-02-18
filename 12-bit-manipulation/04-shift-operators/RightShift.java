/**
 * Demonstrates Right Shift (>>) operator.
 *
 * Right shift moves bits to the right.
 * For positive numbers, zeros are filled on the left.
 *
 * Equivalent to dividing by 2^n (for positive numbers).
 */
public class RightShift {

    /**
     * Performs right shift.
     *
     * @param num input number
     * @param positions number of positions
     * @return result after shifting
     */
    public static int rightShift(int num, int positions) {
        return num >> positions;
    }

    public static void main(String[] args) {

        int num = 10; // binary: 0000 1010

        /*
         * 10 >> 1
         *
         * 0000 1010
         * becomes
         * 0000 0101  -> 5
         *
         * 10 / 2^1 = 5
         */

        int result = rightShift(num, 1);

        System.out.println("Number = " + num);
        System.out.println("After right shift = " + result);
    }
}
