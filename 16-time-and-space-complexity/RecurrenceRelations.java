/**
 * ==========================================================
 * Topic 9/15 : Recurrence Relations
 * ==========================================================
 *
 * A recurrence relation expresses the running time of a
 * recursive algorithm in terms of the running time of
 * smaller inputs.
 *
 * General idea:
 *
 * T(n) = Work done by recursive calls + Work done in current call
 *
 * Recurrence relations are especially useful for analyzing
 * Divide and Conquer algorithms.
 */

public class RecurrenceRelations {

    public static void main(String[] args) {

        System.out.println("===== Common Recurrence Relations =====");

        linearRecurrence();

        divideAndConquerRecurrence();

        binarySearchRecurrence();

        mergeSortRecurrence();

        fibonacciRecurrence();

        System.out.println("\n===== Summary =====");

        System.out.println("T(n) = T(n - 1) + O(1)       -> O(n)");
        System.out.println("T(n) = T(n / 2) + O(1)       -> O(log n)");
        System.out.println("T(n) = 2T(n / 2) + O(n)      -> O(n log n)");
        System.out.println("T(n) = T(n - 1) + T(n - 2)   -> O(2^n)");
    }

    /**
     * Linear Recurrence
     *
     * Example:
     * factorial(n)
     *
     * T(n) = T(n - 1) + O(1)
     *
     * Result:
     * O(n)
     */
    public static void linearRecurrence() {

        System.out.println("\n1. Linear Recurrence");

        System.out.println("T(n) = T(n - 1) + O(1)");

        System.out.println("Example: Recursive Factorial");

        System.out.println("Time Complexity: O(n)");
    }

    /**
     * Divide and Conquer Recurrence
     *
     * Example:
     * Binary Search
     *
     * T(n) = T(n / 2) + O(1)
     *
     * Result:
     * O(log n)
     */
    public static void divideAndConquerRecurrence() {

        System.out.println("\n2. Divide and Conquer Recurrence");

        System.out.println("T(n) = T(n / 2) + O(1)");

        System.out.println("Example: Binary Search");

        System.out.println("Time Complexity: O(log n)");
    }

    /**
     * Binary Search Recurrence
     */
    public static void binarySearchRecurrence() {

        System.out.println("\n3. Binary Search");

        System.out.println("One recursive call");

        System.out.println("Input size becomes n / 2");

        System.out.println("T(n) = T(n / 2) + O(1)");

        System.out.println("Result: O(log n)");
    }

    /**
     * Merge Sort Recurrence
     *
     * Two recursive calls are made on n / 2 elements.
     * Merging takes linear time.
     *
     * T(n) = 2T(n / 2) + O(n)
     *
     * Result:
     * O(n log n)
     */
    public static void mergeSortRecurrence() {

        System.out.println("\n4. Merge Sort");

        System.out.println("Two recursive calls");

        System.out.println("Each receives n / 2 elements");

        System.out.println("Merge operation takes O(n)");

        System.out.println("T(n) = 2T(n / 2) + O(n)");

        System.out.println("Result: O(n log n)");
    }

    /**
     * Fibonacci Recurrence
     *
     * Two recursive calls are made with different
     * input sizes.
     *
     * T(n) = T(n - 1) + T(n - 2) + O(1)
     *
     * Simple recursive implementation:
     * O(2^n)
     */
    public static void fibonacciRecurrence() {

        System.out.println("\n5. Fibonacci");

        System.out.println("T(n) = T(n - 1) + T(n - 2) + O(1)");

        System.out.println("Simple Recursive Fibonacci: O(2^n)");
    }
}

/*
==========================================================

How to Build a Recurrence Relation

Step 1:
Identify the recursive calls.

Step 2:
Determine the input size of each call.

Step 3:
Calculate the work done outside recursion.

Step 4:
Combine them into a recurrence.

----------------------------------------------------------

Example: Binary Search

One recursive call

Input becomes n / 2

Constant work per call

Therefore:

T(n) = T(n / 2) + O(1)

Result:

O(log n)

----------------------------------------------------------

Example: Merge Sort

Two recursive calls

Each receives n / 2 elements.

Merge requires O(n).

Therefore:

T(n) = 2T(n / 2) + O(n)

Result:

O(n log n)

----------------------------------------------------------

Example: Factorial

One recursive call

Input decreases by 1.

Constant work per call.

Therefore:

T(n) = T(n - 1) + O(1)

Result:

O(n)

----------------------------------------------------------

Important Idea

A recurrence relation describes the relationship between the complexity of a problem and its smaller subproblems.

==========================================================
*/