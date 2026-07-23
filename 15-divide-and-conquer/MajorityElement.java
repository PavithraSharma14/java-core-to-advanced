/**
 * Majority Element using Divide and Conquer
 *
 * 📌 Problem:
 * Given an integer array of size n,
 * return the majority element.
 *
 * A majority element appears more than ⌊n/2⌋ times.
 *
 * Example:
 * Input : [2,2,1,1,1,2,2]
 * Output: 2
 *
 * 📌 Divide and Conquer Idea:
 * 1. Divide the array into two halves.
 * 2. Recursively find the majority element in each half.
 * 3. If both halves return the same element,
 *    it is the majority.
 * 4. Otherwise, count both candidates in the current range
 *    and return the one with the higher frequency.
 *
 * 📊 Time Complexity:
 * O(n log n)
 *
 * 📦 Space Complexity:
 * O(log n)
 * (Recursion stack)
 */

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " +
                majorityElement(nums));
    }

    /**
     * Returns the majority element.
     */
    public static int majorityElement(int[] nums) {
        return findMajority(nums, 0, nums.length - 1);
    }

    /**
     * Recursive Divide and Conquer function.
     */
    private static int findMajority(int[] nums, int left, int right) {

        // Base case:
        // A single element is always the majority
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        // Majority in left half
        int leftMajor = findMajority(nums, left, mid);

        // Majority in right half
        int rightMajor = findMajority(nums, mid + 1, right);

        // If both halves agree
        if (leftMajor == rightMajor) {
            return leftMajor;
        }

        // Count occurrences of both candidates
        int leftCount = countOccurrences(nums, leftMajor, left, right);
        int rightCount = countOccurrences(nums, rightMajor, left, right);

        return (leftCount > rightCount)
                ? leftMajor
                : rightMajor;
    }

    /**
     * Counts occurrences of a candidate
     * within a given range.
     */
    private static int countOccurrences(int[] nums,
                                        int candidate,
                                        int left,
                                        int right) {

        int count = 0;

        for (int i = left; i <= right; i++) {

            if (nums[i] == candidate) {
                count++;
            }
        }

        return count;
    }
}

/*
 * Comparison:
 *
 * Divide & Conquer
 * Time  : O(n log n)
 * Space : O(log n)
 *
 * Boyer-Moore Voting
 * Time  : O(n)
 * Space : O(1)
 *
 * Boyer-Moore is the optimal interview solution,
 * but this implementation demonstrates the
 * Divide and Conquer technique.
 */