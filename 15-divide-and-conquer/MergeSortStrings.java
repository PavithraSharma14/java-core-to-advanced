/**
 * Merge Sort for Strings
 *
 * 📌 Problem:
 * Given an array of lowercase strings,
 * sort them in lexicographical (dictionary) order
 * using Merge Sort.
 *
 * Example:
 * Input:
 * {"sun", "earth", "mars", "mercury"}
 *
 * Output:
 * {"earth", "mars", "mercury", "sun"}
 *
 * 📊 Time Complexity:
 * Best Case   : O(n log n)
 * Average Case: O(n log n)
 * Worst Case  : O(n log n)
 *
 * 📦 Space Complexity:
 * O(n)
 */
public class MergeSortStrings {

    public static void main(String[] args) {

        String[] arr = {"sun", "earth", "mars", "mercury"};

        System.out.println("Before Sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

    /**
     * Recursively divides the string array
     */
    public static void mergeSort(String[] arr, int left, int right) {

        // Base condition
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(arr, left, mid);

        // Sort right half
        mergeSort(arr, mid + 1, right);

        // Merge sorted halves
        merge(arr, left, mid, right);
    }

    /**
     * Merges two sorted string arrays
     */
    private static void merge(String[] arr, int left, int mid, int right) {

        String[] temp = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            // compareTo() compares strings lexicographically
            // compareTo() returns:
            // Negative -> first string comes before second
            // Zero     -> both strings are equal
            // Positive -> first string comes after second
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    /**
     * Utility method to print string array
     */
    private static void printArray(String[] arr) {

        for (String word : arr) {
            System.out.print(word + " ");
        }

        System.out.println();
    }
}