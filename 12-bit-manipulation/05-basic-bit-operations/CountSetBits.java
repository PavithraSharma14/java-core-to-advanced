/**
 * Problem: Count Set Bits
 * Concept: Bit Manipulation (Brian Kernighan’s Algorithm)
 *
 * Logic:
 * n & (n - 1) removes the rightmost set bit.
 * Count how many times we can do this until n becomes 0.
 *
 * Time Complexity: O(number of set bits)
 * Space Complexity: O(1)
 */

public class CountSetBits {

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);  // removes rightmost set bit
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 13;  // 1101

        int result = countSetBits(n);

        System.out.println("Number of set bits in " + n + " is: " + result);
    }
}
