/**
 * ==========================================================
 * Topic 5/15 : Recursive Complexity Analysis
 * ==========================================================
 *
 * Recursive algorithms solve a problem by repeatedly calling
 * themselves until a base case is reached.
 *
 * The overall Time Complexity depends on:
 * 1. Number of recursive calls
 * 2. Work done in each call
 *
 * General Formula:
 *
 * Time Complexity =
 * (Number of Recursive Calls) × (Work Per Call)
 */

public class RecursiveComplexityAnalysis {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial of " + n + " = " + factorial(n));

        System.out.println();

        printNumbers(n);

        System.out.println();

        fibonacci(5);

        explainFormula();
    }

    /**
     * Example 1
     * Factorial
     *
     * One recursive call per function.
     *
     * Total Calls = n
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(n)
     */
    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * Example 2
     * Print numbers from n to 1
     *
     * One recursive call for each number.
     *
     * Time Complexity:
     * O(n)
     *
     * Space Complexity:
     * O(n)
     */
    public static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumbers(n - 1);
    }

    /**
     * Example 3
     * Recursive Fibonacci
     *
     * Two recursive calls.
     *
     * Time Complexity:
     * O(2^n)
     *
     * Space Complexity:
     * O(n)
     */
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Prints the general rule for recursive analysis.
     */
    public static void explainFormula() {

        System.out.println("\n===== Recursive Analysis Rule =====");

        System.out.println("Time Complexity =");

        System.out.println("Number of Recursive Calls");

        System.out.println("        ×");

        System.out.println("Work Done Per Call");
    }
}

/*
==========================================================

How to Analyze Recursive Complexity

Step 1

Count how many recursive calls
each function makes.

----------------------------------------

One Recursive Call

factorial(n)

↓

factorial(n-1)

Time Complexity

O(n)

----------------------------------------

Two Recursive Calls

fibonacci(n)

↓

fib(n-1)

fib(n-2)

Time Complexity

O(2^n)

----------------------------------------

Space Complexity

Recursive functions use the
function call stack.

Maximum Stack Depth

↓

Space Complexity

Factorial

Depth = n

Space = O(n)

----------------------------------------

Key Rule

One recursive call

Usually

O(n)

Two recursive calls

Usually

O(2^n)

Divide and Conquer

Often

O(n log n)

----------------------------------------------------------

Interview Tips

✔ Count recursive calls.

✔ Count work inside each call.

✔ Don't forget recursion stack space.

✔ Time Complexity and Space Complexity
are often different.

==========================================================
*/