/*
Time Complexity:
Best Case: O(1) (if element found at first index)
Worst Case: O(n) (if element is at last index or not present)
Reason: Loop may traverse entire array
*/

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        // Loop runs at most n times (n = array length)
        for (int i = 0; i < arr.length; i++) {

            // Each comparison is constant time
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;

        System.out.println(linearSearch(arr, target));
    }
}


