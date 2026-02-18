/**
 * Checks whether a number is even or odd using bitwise AND.
 *
 * Logic:
 * If the last bit (LSB) is 1 → number is odd
 * If the last bit is 0 → number is even
 */
public class CheckOddEven {

    /**
     * Checks if a number is even.
     *
     * @param num input number
     * @return true if even, false if odd
     */
    public static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    /**
     * Checks if a number is odd.
     *
     * @param num input number
     * @return true if odd, false if even
     */
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    public static void main(String[] args) {

        int num = 7;

        /*
         * 7 in binary = 0000 0111
         *
         * num & 1
         *
         * 0000 0111
         * 0000 0001
         * ----------
         * 0000 0001  -> 1 (odd)
         */

        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}

