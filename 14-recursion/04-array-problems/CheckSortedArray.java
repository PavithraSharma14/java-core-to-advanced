// Check if array is sorted (ascending)

public class CheckSortedArray {

    public static boolean isSorted(int[] arr, int i) {
        // Base case
        if (i == arr.length - 1) {
            return true;
        }

        // Condition check
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}