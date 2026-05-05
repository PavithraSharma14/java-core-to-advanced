/**
 * Merge Sort - Basic Implementation
 *
 * 📌 Concept:
 * Merge Sort follows Divide and Conquer approach:
 * 1. Divide the array into two halves
 * 2. Recursively sort both halves
 * 3. Merge the sorted halves
 *
 * 📊 Time Complexity:
 * Best Case   : O(n log n)
 * Average Case: O(n log n)
 * Worst Case  : O(n log n)
 *
 * 📦 Space Complexity:
 * O(n) - Uses extra temporary array
 *
 * ✅ Stable Sorting Algorithm
 * (Maintains relative order of equal elements)
 */
public class MergeSortBasic {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }

    /**
     * Recursively divides the array into smaller subarrays
     */
    public static void mergeSort(int[] arr, int left, int right) {

        // Base condition: if single element, already sorted
        if (left >= right) {
            return;
        }

        // Find middle index safely (avoids overflow)
        int mid = left + (right - left) / 2;

        // Divide left half
        mergeSort(arr, left, mid);

        // Divide right half
        mergeSort(arr, mid + 1, right);

        // Merge sorted halves
        merge(arr, left, mid, right);
    }

    /**
     * Merges two sorted subarrays into one sorted array
     *
     * Left Subarray  : arr[left ... mid]
     * Right Subarray : arr[mid+1 ... right]
     */
    private static void merge(int[] arr, int left, int mid, int right) {

        // Temporary array to store merged result
        int[] temp = new int[right - left + 1];

        int i = left;      // Pointer for left subarray
        int j = mid + 1;   // Pointer for right subarray
        int k = 0;         // Pointer for temp array

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half (if any)
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
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