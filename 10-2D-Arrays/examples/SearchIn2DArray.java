/*
 * Search in a 2D Array
 *
 * This program performs a simple linear search in a 2D array.
 * It checks each element row by row using nested loops.
 *
 * Time Complexity: O(rows × columns)
 * Space Complexity: O(1)
 */

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int key = 50;
        boolean found = false;

        // Linear search in 2D array
        for (int i = 0; i < matrix.length; i++) {              // rows
            for (int j = 0; j < matrix[i].length; j++) {       // columns
                if (matrix[i][j] == key) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

