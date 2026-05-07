/**
 * Quick Sort Implementation
 *
 * 📌 Concept:
 * Quick Sort follows Divide and Conquer:
 * 1. Choose a pivot element
 * 2. Place pivot at its correct sorted position
 * 3. Elements smaller than pivot go left
 * 4. Elements greater than pivot go right
 * 5. Recursively sort left and right subarrays
 *
 * 📊 Time Complexity:
 * Best Case   : O(n log n)
 * Average Case: O(n log n)
 * Worst Case  : O(n^2)
 *
 * 📦 Space Complexity:
 * O(log n) due to recursion stack
 *
 * ⚠️ Quick Sort is NOT stable
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }

    /**
     * Recursive Quick Sort function
     */
    public static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low < high) {

            // Partition array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Sort left subarray
            quickSort(arr, low, pivotIndex - 1);

            // Sort right subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions array around pivot
     *
     * Pivot chosen: last element
     *
     * After partition:
     * - smaller elements on left
     * - greater elements on right
     */
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Place smaller elements before pivot
            if (arr[j] <= pivot) {

                i++;

                swap(arr, i, j);
            }
        }

        // Place pivot in correct position
        swap(arr, i + 1, high);

        return i + 1;
    }

    /**
     * Utility method to swap two elements
     */
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Utility method to print array
     */
    private static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}

/**
 * ⚠️ Worst Case in Quick Sort
 *
 * Worst case occurs when pivot selection creates highly unbalanced partitions.
 *
 * Example:
 * - Already sorted array
 * - Reverse sorted array
 *
 * If smallest or largest element is always chosen as pivot:
 * Time Complexity becomes O(n^2)
 *
 * 💡 Optimization Techniques:
 * - Random Pivot
 * - Median of Three
 */