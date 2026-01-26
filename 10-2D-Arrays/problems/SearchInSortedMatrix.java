/*
 * Problem: Search in a Sorted Matrix
 *
 * Conditions:
 * - Each row is sorted left to right
 * - Each column is sorted top to bottom
 *
 * Approach: Staircase Search (Top-Right Corner)
 */

public class SearchInSortedMatrix {

    // Method to search key in sorted matrix
    public static boolean search(int[][] matrix, int key) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;          // start from first row
        int col = cols - 1;   // start from last column

        // Traverse until we go out of bounds
        while (row < rows && col >= 0) {

            // If key found
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }

            // If key is smaller, move left
            else if (key < matrix[row][col]) {
                col--;
            }

            // If key is larger, move down
            else {
                row++;
            }
        }

        // Key not found
        System.out.println("Key not found");
        return false;
    }

    // Driver code
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 29;
        search(matrix, key);
    }
}
