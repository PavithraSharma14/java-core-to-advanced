/**
 * ==========================================================
 * Topic 3/15 : Iterative Complexity Analysis
 * ==========================================================
 *
 * Iterative Complexity Analysis focuses on determining
 * the Time Complexity of algorithms that use loops.
 *
 * The number of loop iterations determines how many
 * operations are performed as the input size grows.
 *
 * Common loop patterns:
 * - Single Loop
 * - Nested Loops
 * - Independent Loops
 * - Logarithmic Loops
 */

public class IterativeComplexityAnalysis {

    public static void main(String[] args) {

        int n = 8;

        singleLoop(n);

        nestedLoops(n);

        independentLoops(n);

        logarithmicLoop(n);
    }

    /**
     * Single Loop
     *
     * Runs n times.
     *
     * Time Complexity: O(n)
     */
    public static void singleLoop(int n) {

        System.out.println("===== Single Loop =====");

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nTime Complexity: O(n)\n");
    }

    /**
     * Nested Loops
     *
     * Outer loop runs n times.
     * Inner loop runs n times.
     *
     * Total operations = n × n
     *
     * Time Complexity: O(n²)
     */
    public static void nestedLoops(int n) {

        System.out.println("===== Nested Loops =====");

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                count++;
            }
        }

        System.out.println("Operations: " + count);

        System.out.println("Time Complexity: O(n²)\n");
    }

    /**
     * Independent Loops
     *
     * Two separate loops.
     *
     * Operations:
     * n + n = 2n
     *
     * Ignore constants.
     *
     * Time Complexity: O(n)
     */
    public static void independentLoops(int n) {

        System.out.println("===== Independent Loops =====");

        for (int i = 0; i < n; i++) {
            // First loop
        }

        for (int i = 0; i < n; i++) {
            // Second loop
        }

        System.out.println("Time Complexity: O(n)");
    }

    /**
     * Logarithmic Loop
     *
     * The value doubles each iteration.
     *
     * Example:
     * 1 → 2 → 4 → 8
     *
     * Number of iterations = log₂n
     *
     * Time Complexity: O(log n)
     */
    public static void logarithmicLoop(int n) {

        System.out.println("\n===== Logarithmic Loop =====");

        for (int i = 1; i <= n; i *= 2) {

            System.out.print(i + " ");
        }

        System.out.println("\nTime Complexity: O(log n)");
    }
}

/*
==========================================================

Loop Analysis Rules

----------------------------------------------------------

1. Single Loop

for (int i = 0; i < n; i++)

Runs n times.

Complexity

O(n)

----------------------------------------------------------

2. Nested Loops

for (...)
    for (...)

n × n

Complexity

O(n²)

----------------------------------------------------------

3. Independent Loops

for (...)
for (...)

n + n

2n

Ignore constants.

Complexity

O(n)

----------------------------------------------------------

4. Logarithmic Loop

for (i = 1; i <= n; i *= 2)

Iterations

1
2
4
8
16

Complexity

O(log n)

----------------------------------------------------------

Important Rules

Ignore Constants

O(2n)

↓

O(n)

------------------------------------

Ignore Lower Order Terms

O(n² + n)

↓

O(n²)

------------------------------------

Keep the Dominant Term

O(n³ + n² + n)

↓

O(n³)

==========================================================

Interview Tips

✔ Count how many times the loop executes.

✔ Multiplication of loops → O(n²)

✔ Addition of separate loops → O(n)

✔ Doubling/Halving → O(log n)

✔ Always simplify to the dominant term.

==========================================================

*/