/*
 * Practice Question: Diagonal Sum of a Square Matrix
 *
 * Primary Diagonal  : i == j
 * Secondary Diagonal: i + j == n - 1
 *
 * Time Complexity : O(n^2)
 * Space Complexity: O(1)
 */

public class SumOfDiagonal {

    public static int diagonalSum(int[][] matrix) {

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal (avoid double count)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}

