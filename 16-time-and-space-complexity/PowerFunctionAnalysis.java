
/*
 * Topic 10/15 : Power Function Analysis
 *
 * Problem:
 * Calculate a number raised to a given power (a^n).
 *
 * We will explore three approaches:
 * 1. Iterative approach
 * 2. Recursive approach
 * 3. Optimized recursive approach (Exponentiation by Squaring)
 *
 * The goal is to understand how different approaches affect
 * time and space complexity.
 */

public class PowerFunctionAnalysis {

    // --------------------------------------------------
    // Approach 1: Iterative Power
    // --------------------------------------------------
    // Multiply the number by itself n times.
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static long powerIterative(int base, int exponent) {

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    // --------------------------------------------------
    // Approach 2: Recursive Power
    // --------------------------------------------------
    // Reduce the exponent by 1 in every recursive call.
    //
    // Recurrence: T(n) = T(n - 1) + O(1)
    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion stack.

    public static long powerRecursive(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * powerRecursive(base, exponent - 1);
    }

    // --------------------------------------------------
    // Approach 3: Optimized Recursive Power
    // --------------------------------------------------
    // Exponentiation by Squaring:
    // Instead of reducing the exponent by 1,
    // divide it by 2 in every recursive call.
    //
    // If exponent is even:
    // a^n = a^(n/2) * a^(n/2)
    //
    // If exponent is odd:
    // a^n = a * a^(n/2) * a^(n/2)
    //
    // Recurrence: T(n) = T(n / 2) + O(1)
    // Time Complexity: O(log n)
    // Space Complexity: O(log n) due to recursion stack.

    public static long powerOptimized(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        long halfPower = powerOptimized(base, exponent / 2);

        long result = halfPower * halfPower;

        if (exponent % 2 != 0) {
            result *= base;
        }

        return result;
    }

    // --------------------------------------------------
    // Main Method
    // --------------------------------------------------

    public static void main(String[] args) {

        int base = 2;
        int exponent = 10;

        System.out.println("Base: " + base);
        System.out.println("Exponent: " + exponent);

        System.out.println("\nApproach 1: Iterative");
        System.out.println("Result: " +
                powerIterative(base, exponent));

        System.out.println("\nApproach 2: Recursive");
        System.out.println("Result: " +
                powerRecursive(base, exponent));

        System.out.println("\nApproach 3: Optimized Recursive");
        System.out.println("Result: " +
                powerOptimized(base, exponent));

        System.out.println("\nComplexity Comparison:");
        System.out.println("Iterative:          O(n) time, O(1) space");
        System.out.println("Recursive:          O(n) time, O(n) space");
        System.out.println("Optimized Recursive: O(log n) time, O(log n) space");
    }
}

/*
 * KEY TAKEAWAYS:
 *
 * 1. Iterative approach:
 *    Uses a loop and constant extra space.
 *
 * 2. Recursive approach:
 *    Uses n recursive calls, resulting in O(n) time.
 *
 * 3. Optimized recursive approach:
 *    Divides the problem size by 2 in each call.
 *    This reduces the time complexity to O(log n).
 *
 * 4. Exponentiation by Squaring is much faster for
 *    large exponents than the first two approaches.
 *
 * Note:
 * These examples assume a non-negative exponent and use long.
 * Large results can overflow the long data type.
 */
