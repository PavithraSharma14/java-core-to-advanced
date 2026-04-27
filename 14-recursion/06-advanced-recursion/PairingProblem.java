/*
PROBLEM:
Given n friends, each friend can either:
- Stay single
- Pair up with another friend

Find the total number of ways to arrange them.

Example:
Input: n = 3
Output: 4

Ways:
1. (1)(2)(3) → all single
2. (1,2)(3)
3. (1,3)(2)
4. (2,3)(1)

--------------------------------------------------

APPROACH:

For each friend, we have two choices:

1. Stay single
   → remaining problem: f(n - 1)

2. Pair up with any of the remaining (n - 1) friends
   → choose 1 friend out of (n - 1)
   → remaining problem: f(n - 2)

So recurrence becomes:
f(n) = f(n-1) + (n-1) * f(n-2)

BASE CASE:
- f(1) = 1
- f(2) = 2

TIME COMPLEXITY:
- O(2^n) (can be optimized using DP)

--------------------------------------------------
*/

public class PairingProblem {

    public static int friendsPairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int single = friendsPairing(n - 1);

        // Pair
        int pair = (n - 1) * friendsPairing(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}

/*
INSIGHT:
This is a decision-based recursion problem.
Each step reduces the problem size based on choices.
*/
