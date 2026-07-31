/**
 * ==========================================================
 * Topic 8/15 : Merge Sort Complexity Analysis
 * ==========================================================
 *
 * Merge Sort is a Divide and Conquer algorithm.
 *
 * It repeatedly divides the array into smaller halves,
 * sorts each half recursively, and then merges the
 * sorted halves into a single sorted array.
 *
 * Merge Sort guarantees O(n log n) performance
 * in the best, average, and worst cases.
 */

import java.util.Arrays;

public class MergeSortAnalysis {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));

        explainComplexity();
    }

    /**
     * Recursive Merge Sort
     */
    public static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);

        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    /**
     * Merge two sorted halves.
     */
    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    /**
     * Displays complexity analysis.
     */
    public static void explainComplexity() {

        System.out.println("\n===== Merge Sort Complexity =====");

        System.out.println("Best Case    : O(n log n)");
        System.out.println("Average Case : O(n log n)");
        System.out.println("Worst Case   : O(n log n)");

        System.out.println();

        System.out.println("Space Complexity : O(n)");

        System.out.println("Stable Sorting   : Yes");

        System.out.println("In-place Sorting : No");
    }
}

/*
==========================================================

Merge Sort Analysis

How Merge Sort Works

Step 1

Divide the array
into two equal halves.

↓

Step 2

Recursively sort
each half.

↓

Step 3

Merge both sorted halves.

----------------------------------------------------------

Recurrence Relation

T(n) = 2T(n/2) + O(n)

Where

2T(n/2)

↓

Two recursive calls

O(n)

↓

Time required to merge
both halves.

----------------------------------------------------------

Recursion Tree

Level 0

n

↓

Level 1

n/2 + n/2

↓

Level 2

n/4 + n/4 + n/4 + n/4

↓

...

Each level performs

O(n)

work.

Number of levels

log₂n

Total Time

O(n × log n)

=

O(n log n)

----------------------------------------------------------

Time Complexity

Best Case

O(n log n)

----------------------------------------------------------

Average Case

O(n log n)

----------------------------------------------------------

Worst Case

O(n log n)

Merge Sort always divides
the array equally,
regardless of input order.

----------------------------------------------------------

Space Complexity

Temporary array is used
during merging.

Extra Space

O(n)

----------------------------------------------------------

Properties

✔ Stable Sorting Algorithm

✔ Predictable Performance

✔ Suitable for Linked Lists

✖ Not In-place

----------------------------------------------------------

Comparison

Bubble Sort

O(n²)

Quick Sort

Average: O(n log n)

Worst: O(n²)

Merge Sort

Always

O(n log n)

==========================================================

Interview Tips

✔ Merge Sort uses Divide and Conquer.

✔ Time complexity remains the same
for all cases.

✔ Space complexity is O(n)
because of the temporary array.

✔ The recurrence relation

T(n) = 2T(n/2) + O(n)

is one of the most frequently
asked interview concepts.

==========================================================

*/