/*
 * Problem: Find the Largest String
 *
 * The largest string is determined using
 * lexicographical (dictionary) order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LargestString {

    public static String findLargest(String[] arr) {

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        String[] fruits = {"apple", "mango", "banana"};

        System.out.println("Largest String: " + findLargest(fruits));
    }
}

