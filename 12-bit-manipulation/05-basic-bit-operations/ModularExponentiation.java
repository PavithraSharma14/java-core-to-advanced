/**
 * Problem: Modular Exponentiation (a^n % m)
 *
 * Concept:
 * Uses Binary Exponentiation with modulo applied at each step
 * to avoid overflow.
 *
 * Core Formula:
 * (a * b) % m = ((a % m) * (b % m)) % m
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class ModularExponentiation {

    public static long modPower(long base, long exponent, long mod) {

        long result = 1;

        // Reduce base initially to prevent large numbers
        base = base % mod;

        while (exponent > 0) {

            // If exponent is odd
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }

            // Square the base and apply modulo
            base = (base * base) % mod;

            // Divide exponent by 2
            exponent = exponent >> 1;
        }

        return result;
    }

    public static void main(String[] args) {

        long base = 5;
        long exponent = 13;
        long mod = 1000000007;

        long answer = modPower(base, exponent, mod);

        System.out.println("Result: " + answer);
    }
}
