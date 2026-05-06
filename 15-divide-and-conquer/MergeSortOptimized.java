/**
 * Merge Sort - Space Optimized Implementation
 *
 * 📌 Concept:
 * Same Divide and Conquer approach as basic Merge Sort,
 * but optimized to avoid repeated creation of temporary arrays.
 *
 * 🔥 Optimization:
 * Instead of creating a new temp array in every merge call,
 * we create a single temp array once and reuse it.
 *
 * 📊 Time Complexity:
 * Best Case   : O(n log n)
 * Average Case: O(n log n)
 * Worst Case  : O(n log n)
 *
 * 📦 Space Complexity:
 * O(n) - but avoids repeated allocations (more efficient in practice)
 *
 * ✅ Stable Sorting Algorithm
 */
public class MergeSortOptimized {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before Sorting:");
        printArray(arr);

        // Create temp array once
        int[] temp = new int[arr.length];

        mergeSort(arr, temp, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }

    /**
     * Recursive divide function
     */
    public static void mergeSort(int[] arr, int[] temp, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Divide
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        // Merge using shared temp array
        merge(arr, temp, left, mid, right);
    }

    /**
     * Merge function using reusable temp array
     */
    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {

        int i = left;      // left half pointer
        int j = mid + 1;   // right half pointer
        int k = left;      // temp array index (same indexing)

        // Merge both halves into temp[]
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back from temp[] to original array
        for (int p = left; p <= right; p++) {
            arr[p] = temp[p];
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