/*
Binary Search in Java

Precondition:
- Array must be sorted in ascending order

Time Complexity:
Best Case: O(1)
Worst Case: O(log n)

Space Complexity:
O(1) — iterative approach
*/

public class BinarySearch {

    // Returns index of target if found, else -1
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Prevents integer overflow
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;   // Search right half
            } else {
                right = mid - 1;  // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

