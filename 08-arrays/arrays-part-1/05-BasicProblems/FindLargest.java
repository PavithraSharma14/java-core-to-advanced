/* Time Complexity
Loop runs exactly n times
O(n) */

public class FindLargest {

    static int findLargest(int[] arr) {

        int max = arr[0];

        // Loop checks every element once
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6};
        System.out.println(findLargest(arr));
    }
}

