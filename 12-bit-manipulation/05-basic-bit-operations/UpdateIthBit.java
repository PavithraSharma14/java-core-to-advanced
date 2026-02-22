/**
 * Updates the i-th bit of a number to a given value (0 or 1).
 *
 * Bit positions start from 0 (rightmost bit).
 */
public class UpdateIthBit {

    /**
     * Updates the i-th bit to newBit (0 or 1).
     *
     * @param num input number
     * @param i bit position (0-based from right)
     * @param newBit value to set (0 or 1)
     * @return updated number
     */
    public static int updateIthBit(int num, int i, int newBit) {

        // Step 1: Clear the i-th bit
        num = num & ~(1 << i);

        // Step 2: Set the bit if newBit = 1
        return num | (newBit << i);
    }

    public static void main(String[] args) {

        int num = 10;  // binary: 1010
        int position = 1;
        int newBit = 0;

        /*
         * Original: 1010
         *
         * Clear bit 1:
         * 1010
         * & 1101
         * ------
         * 1000
         *
         * newBit = 0 → nothing changes
         *
         * Final: 1000 → 8
         */

        int result = updateIthBit(num, position, newBit);

        System.out.println("Original Number = " + num);
        System.out.println("After Updating Bit " + position + " = " + result);
    }
}
