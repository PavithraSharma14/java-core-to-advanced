/**
 * Problem: Clear Last I Bits
 * Concept: Bit Masking
 * 
 * Explanation:
 * To clear last i bits of a number n,
 * create a mask by left shifting ~0 by i positions.
 * 
 * Formula:
 * n & (~0 << i)
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class ClearLastIBits {

    public static int clearLastIBits(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }

    public static void main(String[] args) {
        int n = 29;  // Binary: 11101
        int i = 2;

        int result = clearLastIBits(n, i);

        System.out.println("Original Number: " + n);
        System.out.println("After clearing last " + i + " bits: " + result);
    }
}