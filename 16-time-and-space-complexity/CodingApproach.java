
/*
 * Topic 11/15 : How to Approach Coding Questions
 *
 * A good developer does not start coding immediately.
 * First, understand the problem, identify constraints,
 * choose an approach, and analyze its complexity.
 *
 * Follow these 6 steps:
 *
 * 1. Understand the problem.
 * 2. Identify input, output, and constraints.
 * 3. Think of a brute-force solution.
 * 4. Optimize the approach.
 * 5. Analyze time and space complexity.
 * 6. Test edge cases.
 */

public class CodingApproach {

    // --------------------------------------------------
    // Example Problem:
    // Find the maximum element in an array.
    // --------------------------------------------------

    // Step 1: Understand the problem
    // Given an integer array, return its largest element.

    // Step 2: Identify constraints
    // - Array should not be empty.
    // - Elements can be positive, negative, or zero.

    // Step 3: Brute-force / direct approach
    // Compare each element and keep track of the maximum.
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int findMaximum(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be empty."
            );
        }

        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    // --------------------------------------------------
    // Step 4: Analyze the approach
    // --------------------------------------------------
    // We visit every array element exactly once.
    // Therefore, the number of operations grows with n.
    //
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    //
    // This is already an optimal approach because
    // every element may need to be checked.

    // --------------------------------------------------
    // Step 5: Test edge cases
    // --------------------------------------------------

    public static void testCases() {

        int[][] testArrays = {
            {3, 7, 2, 9, 5},
            {-8, -3, -10, -1},
            {42},
            {0, 0, 0}
        };

        for (int[] arr : testArrays) {
            System.out.println(
                    "Maximum: " + findMaximum(arr)
            );
        }
    }

    // --------------------------------------------------
    // Main Method
    // --------------------------------------------------

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23};

        System.out.println(
                "Maximum element: " + findMaximum(numbers)
        );

        System.out.println("\nTesting Edge Cases:");
        testCases();
    }
}

/*
 * CODING INTERVIEW CHECKLIST:
 *
 * 1. Understand:
 *    Can I explain the problem in my own words?
 *
 * 2. Constraints:
 *    What is the input size? Are there special conditions?
 *
 * 3. Brute Force:
 *    Can I solve it using a simple approach first?
 *
 * 4. Optimization:
 *    Can I reduce unnecessary loops or operations?
 *    Can I use sorting, hashing, binary search, or recursion?
 *
 * 5. Complexity:
 *    What is the time complexity?
 *    What is the auxiliary space complexity?
 *
 * 6. Testing:
 *    Have I checked empty, single-element, duplicate,
 *    negative, and boundary-value cases where applicable?
 *
 * IMPORTANT:
 * Do not optimize blindly. First find a correct solution,
 * then improve it if the constraints require it.
 */
