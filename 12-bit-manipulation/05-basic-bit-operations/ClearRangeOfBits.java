/**
 * Problem: Clear Bits in Range i to j
 * Concept: Bit Masking
 *
 * Clears bits from position i to j (inclusive).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class ClearRangeOfBits {

    public static int clearRangeOfBits(int n, int i, int j) {

        // Create left mask (1s after j)
        int left = (~0) << (j + 1);

        // Create right mask (1s before i)
        int right = (1 << i) - 1;

        // Combine both masks
        int mask = left | right;

        // Apply mask
        return n & mask;
    }

    public static void main(String[] args) {
        int n = 31;   // 11111
        int i = 1;
        int j = 3;

        int result = clearRangeOfBits(n, i, j);

        System.out.println("Original Number: " + n);
        System.out.println("After clearing bits from " + i + " to " + j + ": " + result);
    }
}
