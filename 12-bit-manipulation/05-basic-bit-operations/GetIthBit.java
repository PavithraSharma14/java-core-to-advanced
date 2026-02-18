/**
 * Gets the i-th bit of a number.
 *
 * Bit positions start from 0 (rightmost bit).
 *
 * Example:
 * Position:  3 2 1 0
 * Number 10: 1 0 1 0
 */
public class GetIthBit {

    /**
     * Returns the i-th bit of a number.
     *
     * @param num input number
     * @param i bit position (0-based from right)
     * @return 0 or 1
     */
    public static int getIthBit(int num, int i) {
        return (num >> i) & 1;
    }

    public static void main(String[] args) {

        int num = 10;  // binary: 1010
        int position = 1;

        /*
         * Step 1: Right shift by position
         *
         * 1010 >> 1 = 0101
         *
         * Step 2: AND with 1
         *
         * 0101
         * 0001
         * ----
         * 0001  -> 1
         */

        int bit = getIthBit(num, position);

        System.out.println("Number = " + num);
        System.out.println("Bit at position " + position + " = " + bit);
    }
}

