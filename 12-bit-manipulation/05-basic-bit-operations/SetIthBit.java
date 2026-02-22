/**
 * Sets the i-th bit of a number to 1.
 *
 * Bit positions start from 0 (rightmost bit).
 */
public class SetIthBit {

    /**
     * Sets the i-th bit to 1.
     *
     * @param num input number
     * @param i bit position (0-based from right)
     * @return updated number
     */
    public static int setIthBit(int num, int i) {
        return num | (1 << i);
    }

    public static void main(String[] args) {

        int num = 8;     // binary: 1000
        int position = 1;

        /*
         * Step 1: Create mask
         * 1 << 1 = 0010
         *
         * Step 2: OR with original number
         *
         *   1000
         * | 0010
         * --------
         *   1010  -> 10
         */

        int result = setIthBit(num, position);

        System.out.println("Original Number = " + num);
        System.out.println("After Setting Bit " + position + " = " + result);
    }
}
