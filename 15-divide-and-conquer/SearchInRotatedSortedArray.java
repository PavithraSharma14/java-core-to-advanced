/**
 * Search in Rotated Sorted Array
 *
 * 📌 Problem:
 * Given a sorted array that has been rotated at some pivot,
 * find the index of a target element.
 *
 * Example:
 * Array  : [4, 5, 6, 7, 0, 1, 2]
 * Target : 0
 * Output : 4
 *
 * 💡 Idea:
 * Even after rotation, at least one half of the array
 * is always sorted.
 *
 * We use Modified Binary Search:
 * 1. Find the middle element
 * 2. Identify which half is sorted
 * 3. Check if target lies in that half
 * 4. Discard the other half
 *
 * 📊 Time Complexity:
 * O(log n)
 *
 * 📦 Space Complexity:
 * O(1)
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(nums, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    /**
     * Searches target using Modified Binary Search
     */
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies within left sorted half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies within right sorted half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}