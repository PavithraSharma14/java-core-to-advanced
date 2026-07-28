/**
 * ==========================================================
 * Topic 6/15 : Bubble Sort Complexity Analysis
 * ==========================================================
 *
 * Bubble Sort repeatedly compares adjacent elements
 * and swaps them if they are in the wrong order.
 *
 * After each pass, the largest element moves to its
 * correct position at the end of the array.
 */

import java.util.Arrays;

public class BubbleSortAnalysis {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));

        explainComplexity();
    }

    /**
     * Bubble Sort Implementation
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps occur, the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Explains the complexity analysis of Bubble Sort.
     */
    public static void explainComplexity() {

        System.out.println("\n===== Bubble Sort Complexity =====");

        System.out.println("Best Case    : O(n)");
        System.out.println("Average Case : O(n²)");
        System.out.println("Worst Case   : O(n²)");

        System.out.println();

        System.out.println("Space Complexity : O(1)");

        System.out.println("Stable Sorting   : Yes");

        System.out.println("In-place Sorting : Yes");
    }
}

/*
==========================================================

Bubble Sort Analysis

How Bubble Sort Works

Pass 1

Compare adjacent elements.

Swap if required.

Largest element reaches
the last position.

Pass 2

Second largest element
reaches its correct position.

Continue until the array
becomes sorted.

----------------------------------------------------------

Time Complexity

Best Case

Array is already sorted.

Only one pass is required.

O(n)

----------------------------------------------------------

Average Case

Nested loops execute.

Approximately

n² / 2 comparisons

O(n²)

----------------------------------------------------------

Worst Case

Reverse sorted array.

Maximum comparisons

Maximum swaps

O(n²)

----------------------------------------------------------

Space Complexity

Only one temporary variable
is used for swapping.

O(1)

----------------------------------------------------------

Properties

✔ Stable Sorting Algorithm

✔ In-place Sorting

✔ Easy to understand

✖ Not efficient for large datasets

----------------------------------------------------------

Interview Tips

Bubble Sort is rarely used
in production systems.

It is mainly used to understand
sorting concepts and complexity analysis.

==========================================================
*/
