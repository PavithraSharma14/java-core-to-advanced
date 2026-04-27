/*
PROBLEM:
Given a 2 × n board and tiles of size 2 × 1,
count the number of ways to tile the board.

Tiles can be placed:
- Vertically (covering 2 × 1)
- Horizontally (covering 1 × 2, requires 2 tiles stacked)

Example:
Input: n = 3
Output: 3

Ways:
1. Vertical + Vertical + Vertical
2. Horizontal (2 tiles) + Vertical
3. Vertical + Horizontal (2 tiles)

--------------------------------------------------

APPROACH:

At each step, we have two choices:

1. Place tile vertically
   → reduces problem to n - 1

2. Place tiles horizontally (pair)
   → reduces problem to n - 2

So the recurrence becomes:
f(n) = f(n-1) + f(n-2)

BASE CASE:
- f(0) = 1 (empty board)
- f(1) = 1 (only vertical possible)

This is similar to Fibonacci.

TIME COMPLEXITY:
- O(2^n) (can be optimized using DP)

--------------------------------------------------
*/

public class TilingProblem {

    public static int countWays(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical placement
        int vertical = countWays(n - 1);

        // Horizontal placement
        int horizontal = countWays(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }
}