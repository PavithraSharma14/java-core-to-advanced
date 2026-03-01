/**
 * Problem: Fast Exponentiation (a^n)
 * 
 * Concept:
 * Instead of multiplying 'a' n times (O(n)),
 * we use Binary Exponentiation to reduce time complexity to O(log n).
 *
 * Core Idea:
 * - If n is even:
 *      a^n = (a^(n/2))^2
 *
 * - If n is odd:
 *      a^n = a * (a^(n/2))^2
 *
 * We process exponent using bit manipulation:
 * - (n & 1) → checks if n is odd
 * - n >> 1 → divides n by 2
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class FastExponentiation {

    public static long power(long base, int exponent) {

        long result = 1;  // Stores final answer

        while (exponent > 0) {

            // Step 1: If current exponent is odd
            // (exponent & 1) checks the last bit
            if ((exponent & 1) == 1) {
                result = result * base;
            }

            // Step 2: Square the base
            // Because we are halving the exponent
            base = base * base;

            // Step 3: Right shift exponent (divide by 2)
            exponent = exponent >> 1;
        }

        return result;
    }

    public static void main(String[] args) {

        long base = 3;
        int exponent = 5;

        long answer = power(base, exponent);

        System.out.println(base + " raised to power " + exponent + " = " + answer);
    }
}
