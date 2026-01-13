/*
Maximum Subarray Sum – Prefix Sum Approach

Time Complexity: O(n^2)
Space Complexity: O(n)

Approach:
- Create prefix sum array
- Use it to calculate subarray sums in O(1)
*/

public class MaxSubarrayPrefixSum {

    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentSum = (start == 0)
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];

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
