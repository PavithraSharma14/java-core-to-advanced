/*
PROBLEM:
Generate all binary strings of length n such that there are no consecutive 1s.

Example:
Input: n = 3
Output:
000
001
010
100
101

Invalid:
110, 111 (because they contain consecutive 1s)

--------------------------------------------------

APPROACH:

At each step, we have two choices:
1. Place '0' → always allowed
2. Place '1' → only allowed if previous character was NOT '1'

We track:
- n → remaining length
- lastPlace → last placed character (0 or 1)
- str → current string being built

RECURSION LOGIC:
- If lastPlace == 0 → we can place both 0 and 1
- If lastPlace == 1 → we can only place 0

BASE CASE:
- When n == 0 → print the string

TIME COMPLEXITY:
- O(2^n) (reduced due to constraint)

--------------------------------------------------
*/

public class BinaryStrings {

    public static void printBinary(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always place '0'
        printBinary(n - 1, 0, str + "0");

        // Place '1' only if previous was not '1'
        if (lastPlace == 0) {
            printBinary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinary(n, 0, "");
    }
}

/*
STACK INSIGHT:
This is a decision tree recursion.
Each level represents a position in the string.
Constraint reduces branching when lastPlace == 1.
*/