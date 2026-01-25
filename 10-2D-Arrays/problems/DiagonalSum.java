/*
 * Problem: Diagonal Sum of a 2D Array
 *
 * A diagonal in a square matrix:
 * - Primary diagonal elements are at index [i][i]
 * - Secondary diagonal elements are at index [i][n - 1 - i]
 *
 * If the matrix size is odd, the center element lies on both diagonals,
 * so it must be added only once.
 */

public class DiagonalSum {

    // Method to calculate diagonal sum
    public static int diagonalSum(int[][] matrix) {

        int n = matrix.length; // size of square matrix
        int sum = 0;

        // Traverse each row once
        for (int i = 0; i < n; i++) {

            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element
            // Condition avoids double-counting the middle element
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args) {

        int[][] matrix = {
            {1,  2,  3},
            {4,  5,  6},
            {7,  8,  9}
        };

        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum = " + result);
    }
}

