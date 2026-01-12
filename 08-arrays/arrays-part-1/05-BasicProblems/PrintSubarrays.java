/*
Time Complexity: O(n^3)
Reason:
- First loop: n
- Second loop: n
- Third loop (printing): up to n
*/

public class PrintSubarrays {

    static void printSubarrays(int[] arr) {

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                // Printing elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubarrays(arr);
    }
}

