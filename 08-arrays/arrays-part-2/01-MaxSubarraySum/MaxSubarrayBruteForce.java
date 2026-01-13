/*
Maximum Subarray Sum – Brute Force Approach

Time Complexity: O(n^3)
Space Complexity: O(1)

Approach:
- Generate all possible subarrays
- Calculate sum for each subarray
- Track the maximum sum
*/

public class MaxSubarrayBruteForce {

    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int currentSum = 0;

                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
    }
}


