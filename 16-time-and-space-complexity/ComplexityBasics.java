/**
 * ==========================================================
 * Topic 1/15 : Complexity Basics
 * ==========================================================
 *
 * Time and Space Complexity help us measure the efficiency
 * of an algorithm as the input size increases.
 *
 * Instead of measuring execution time in seconds,
 * we analyze how the algorithm grows with increasing input.
 *
 * This makes complexity analysis independent of
 * hardware, programming language, and system performance.
 */

public class ComplexityBasics {

    public static void main(String[] args) {

        int n = 100;

        System.out.println("Input Size (n): " + n);

        demonstrateTimeComplexity(n);

        demonstrateSpaceComplexity(n);

        explainCases();
    }

    /**
     * Demonstrates a simple linear algorithm.
     */
    public static void demonstrateTimeComplexity(int n) {

        System.out.println("\n----- Time Complexity Example -----");

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        /*
         * Loop executes n times.
         *
         * Time Complexity:
         * O(n)
         */
    }

    /**
     * Demonstrates auxiliary space usage.
     */
    public static void demonstrateSpaceComplexity(int n) {

        System.out.println("\n----- Space Complexity Example -----");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Array Size = " + arr.length);

        /*
         * Extra array of size n
         *
         * Space Complexity:
         * O(n)
         */
    }

    /**
     * Explains best, average, and worst cases.
     */
    public static void explainCases() {

        System.out.println("\n----- Complexity Cases -----");

        System.out.println("Best Case    : Minimum operations");
        System.out.println("Average Case : Expected operations");
        System.out.println("Worst Case   : Maximum operations");
    }
}

/*
==========================================================

What is Time Complexity?

Time Complexity measures how the running time
of an algorithm grows as the input size increases.

Example:

n = 10

Loop executes 10 times.

n = 1000

Loop executes 1000 times.

Instead of saying

"This takes 0.002 seconds"

we say

O(n)

because execution time depends on hardware.

==========================================================

What is Space Complexity?

Space Complexity measures the amount of extra
memory required by an algorithm.

Example

int[] arr = new int[n];

Extra memory increases with input.

Space Complexity

O(n)

==========================================================

Why Complexity Matters?

✔ Compare algorithms

✔ Choose better solutions

✔ Handle very large datasets

✔ Crack coding interviews

✔ Build scalable software

==========================================================

Types of Complexity Analysis

Best Case

Minimum operations performed.

Average Case

Expected operations for random input.

Worst Case

Maximum operations performed.

Most interview questions focus on Worst Case.

==========================================================
*/