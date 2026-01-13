/*
Kadane’s Algorithm – Maximum Subarray Sum

Handles:
- All positive elements
- Mixed positive and negative elements
- All negative elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaxSubarrayKadane {

    // Returns the maximum sum of a contiguous subarray
    public static int maxSubarraySum(int[] arr) {
        // Initialize with first element to handle all-negative arrays
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Decide whether to start new subarray or extend existing one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, -1, -5};

        int result = maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
