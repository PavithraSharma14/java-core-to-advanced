/**
 * Clears (sets to 0) the i-th bit of a number.
 *
 * Bit positions start from 0 (rightmost bit).
 */
public class ClearIthBit {

    /**
     * Clears the i-th bit.
     *
     * @param num input number
     * @param i bit position (0-based from right)
     * @return updated number
     */
    public static int clearIthBit(int num, int i) {
        return num & ~(1 << i);
    }

    public static void main(String[] args) {

        int num = 10;   // binary: 1010
        int position = 1;

        /*
         * Step 1: Create mask
         * 1 << 1 = 0010
         *
         * Step 2: NOT the mask
         * ~(0010) = 1101
         *
         * Step 3: AND with original number
         *
         *   1010
         * & 1101
         * --------
         *   1000  -> 8
         */

        int result = clearIthBit(num, position);

        System.out.println("Original Number = " + num);
        System.out.println("After Clearing Bit " + position + " = " + result);
    }
}