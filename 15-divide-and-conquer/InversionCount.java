/**
 * Inversion Count using Merge Sort
 *
 * 📌 Problem:
 * Given an integer array, count the number of inversions.
 *
 * An inversion is a pair (i, j) such that:
 * i < j and arr[i] > arr[j]
 *
 * Example:
 * Input : {2, 4, 1, 3, 5}
 * Output: 3
 *
 * Inversions:
 * (2,1)
 * (4,1)
 * (4,3)
 *
 * 💡 Idea:
 * While merging two sorted halves,
 * if an element from the right half is smaller than
 * an element from the left half,
 * then all remaining elements in the left half
 * will also be greater than that element.
 *
 * This allows us to count multiple inversions at once.
 *
 * 📊 Time Complexity:
 * O(n log n)
 *
 * 📦 Space Complexity:
 * O(n)
 */

public class InversionCount {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};

        System.out.println("Inversion Count: " + countInversions(arr));
    }

    /**
     * Returns total inversion count.
     */
    public static int countInversions(int[] arr) {

        return mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursively divides the array
     * and counts inversions.
     */
    private static int mergeSort(int[] arr, int left, int right) {

        int count = 0;

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Count inversions in left half
            count += mergeSort(arr, left, mid);

            // Count inversions in right half
            count += mergeSort(arr, mid + 1, right);

            // Count inversions while merging
            count += merge(arr, left, mid, right);
        }

        return count;
    }

    /**
     * Merges two sorted halves
     * while counting inversions.
     */
    private static int merge(int[] arr,
                             int left,
                             int mid,
                             int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        int count = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {

                temp[k++] = arr[i++];

            } else {

                temp[k++] = arr[j++];

                /*
                 * Since left half is sorted,
                 * every remaining element
                 * from i to mid is greater.
                 */

                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }

        return count;
    }
}