/*
Trapping Rain Water Problem

Time Complexity: O(n)
Space Complexity: O(n)

Approach:
- Precompute leftMax and rightMax arrays
- Water at each index depends on min(leftMax, rightMax)
*/

public class TrappingRainWater {

    public static int trap(int[] height) {
        int n = height.length;

        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rain Water: " + trap(height));
    }
}
