/**
 * ==========================================================
 * Topic 4/15 : Common Time Complexities
 * ==========================================================
 *
 * Different algorithms grow at different rates as the input
 * size increases. Understanding common time complexities
 * helps compare algorithms and choose the most efficient one.
 */

public class CommonComplexities {

    public static void main(String[] args) {

        constantTime();

        logarithmicTime();

        linearTime();

        linearithmicTime();

        quadraticTime();

        exponentialTime();

        factorialTime();
    }

    /**
     * O(1) - Constant Time
     *
     * Execution time does not depend on input size.
     */
    public static void constantTime() {

        System.out.println("===== O(1) : Constant Time =====");

        int[] arr = {10, 20, 30, 40};

        System.out.println("First Element: " + arr[0]);

        System.out.println("Accessing an array element always takes constant time.\n");
    }

    /**
     * O(log n) - Logarithmic Time
     *
     * Input size is reduced in every iteration.
     */
    public static void logarithmicTime() {

        System.out.println("===== O(log n) : Logarithmic Time =====");

        int n = 16;

        while (n > 1) {

            System.out.print(n + " ");

            n /= 2;
        }

        System.out.println("\nBinary Search is a common O(log n) algorithm.\n");
    }

    /**
     * O(n) - Linear Time
     *
     * Number of operations grows directly
     * with the input size.
     */
    public static void linearTime() {

        System.out.println("===== O(n) : Linear Time =====");

        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTraversing an array requires linear time.\n");
    }

    /**
     * O(n log n) - Linearithmic Time
     *
     * Common in efficient Divide and Conquer algorithms.
     */
    public static void linearithmicTime() {

        System.out.println("===== O(n log n) : Linearithmic Time =====");

        System.out.println("Examples:");

        System.out.println("- Merge Sort");

        System.out.println("- Quick Sort (Average Case)");

        System.out.println("- Heap Sort\n");
    }

    /**
     * O(n²) - Quadratic Time
     *
     * Usually occurs due to nested loops.
     */
    public static void quadraticTime() {

        System.out.println("===== O(n²) : Quadratic Time =====");

        int operations = 0;

        int n = 4;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                operations++;
            }
        }

        System.out.println("Operations: " + operations);

        System.out.println("Nested loops often result in quadratic complexity.\n");
    }

    /**
     * O(2ⁿ) - Exponential Time
     *
     * Number of recursive calls doubles
     * at each level.
     */
    public static void exponentialTime() {

        System.out.println("===== O(2ⁿ) : Exponential Time =====");

        System.out.println("Common Example:");

        System.out.println("- Recursive Fibonacci\n");
    }

    /**
     * O(n!) - Factorial Time
     *
     * Generates every possible arrangement
     * or permutation.
     */
    public static void factorialTime() {

        System.out.println("===== O(n!) : Factorial Time =====");

        System.out.println("Common Example:");

        System.out.println("- Generating all permutations");

        System.out.println("- Travelling Salesman (Brute Force)");
    }
}

/*
==========================================================

Common Time Complexities

O(1)
Constant

Example:
Array Index Access

----------------------------------------------------------

O(log n)
Logarithmic

Example:
Binary Search

----------------------------------------------------------

O(n)
Linear

Example:
Linear Search

----------------------------------------------------------

O(n log n)
Linearithmic

Examples:
Merge Sort
Heap Sort
Quick Sort (Average)

----------------------------------------------------------

O(n²)
Quadratic

Examples:
Bubble Sort
Selection Sort
Insertion Sort (Worst Case)

----------------------------------------------------------

O(2ⁿ)
Exponential

Example:
Recursive Fibonacci

----------------------------------------------------------

O(n!)
Factorial

Example:
Generating all permutations

----------------------------------------------------------

Performance Order

Best
│
├── O(1)
├── O(log n)
├── O(n)
├── O(n log n)
├── O(n²)
├── O(2ⁿ)
└── O(n!)

Worst

==========================================================

Interview Tips

✔ Prefer O(log n) over O(n).

✔ Prefer O(n) over O(n²).

✔ O(n log n) is usually acceptable for sorting.

✔ Avoid O(2ⁿ) and O(n!) unless the input size is very small.

==========================================================
*/