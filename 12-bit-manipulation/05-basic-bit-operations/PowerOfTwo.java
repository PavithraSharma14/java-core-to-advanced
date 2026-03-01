/**
 * Problem: Check if a Number is Power of 2
 * Concept: Bit Manipulation
 *
 * Logic:
 * A power of 2 has only one set bit.
 * Example:
 * 1  -> 0001
 * 2  -> 0010
 * 4  -> 0100
 * 8  -> 1000
 *
 * Trick:
 * For power of 2:
 * n & (n - 1) == 0
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;  // negative numbers and 0 are not powers of 2
        }

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;

        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a Power of 2");
        } else {
            System.out.println(n + " is NOT a Power of 2");
        }
    }
}
