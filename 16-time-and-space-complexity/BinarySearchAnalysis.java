/**
 * ==========================================================
 * Topic 7/15 : Binary Search Complexity Analysis
 * ==========================================================
 *
 * Binary Search is an efficient searching algorithm that
 * works only on sorted arrays.
 *
 * Instead of searching every element, it repeatedly
 * divides the search space into two halves.
 *
 * This reduces the number of comparisons significantly,
 * making Binary Search much faster than Linear Search
 * for large datasets.
 */

import java.util.Arrays;

public class BinarySearchAnalysis {

    public static void main(String[] args) {

        int[] arr = {3, 7, 12, 18, 25, 31, 42, 56, 68};

        int target = 31;

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("\nElement found at index " + index);
        } else {
            System.out.println("\nElement not found.");
        }

        explainComplexity();
    }

    /**
     * Performs Binary Search on a sorted array.
     *
     * Time Complexity:
     * Best Case  : O(1)
     * Worst Case : O(log n)
     */
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /**
     * Displays the complexity analysis.
     */
    public static void explainComplexity() {

        System.out.println("\n===== Binary Search Complexity =====");

        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");

        System.out.println();

        System.out.println("Space Complexity (Iterative): O(1)");
        System.out.println("Space Complexity (Recursive): O(log n)");

        System.out.println();

        System.out.println("Prerequisite: Array must be sorted.");
    }
}

/*
==========================================================

Binary Search Analysis

How Binary Search Works

Example

Array Size = 16

Step 1

16 elements

↓

8 elements

↓

4 elements

↓

2 elements

↓

1 element

The search space is halved
after every comparison.

----------------------------------------------------------

Why O(log n)?

Each iteration removes
half of the remaining elements.

Iterations

n

↓

n/2

↓

n/4

↓

n/8

↓

...

↓

1

Number of divisions

log₂n

Therefore

Time Complexity

O(log n)

----------------------------------------------------------

Time Complexity

Best Case

Target is the middle element.

O(1)

----------------------------------------------------------

Average Case

Search space keeps shrinking.

O(log n)

----------------------------------------------------------

Worst Case

Element is at the last possible position
or does not exist.

O(log n)

----------------------------------------------------------

Space Complexity

Iterative Binary Search

Uses only a few variables.

O(1)

Recursive Binary Search

Uses recursion stack.

O(log n)

----------------------------------------------------------

Comparison

Linear Search

Time Complexity

O(n)

Binary Search

Time Complexity

O(log n)

Binary Search is much faster
for large sorted datasets.

----------------------------------------------------------

Interview Tips

✔ Works only on sorted data.

✔ Search space is reduced by half
after every comparison.

✔ Use

mid = left + (right - left) / 2

instead of

(left + right) / 2

to avoid integer overflow.

==========================================================

Input Size (n)     Maximum Comparisons

1                  1
2                  2
4                  3
8                  4
16                 5
32                 6
64                 7
128                8

*/