/*
 * Practice Question: Row-wise Sum of a 2D Matrix
 *
 * Time Complexity : O(rows × cols)
 * Space Complexity: O(1)
 */

public class RowWiseSum {

    public static void rowWiseSum(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse each row
        for (int i = 0; i < rows; i++) {

            int sum = 0; // reset sum for each row

            // Traverse columns of current row
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of row " + i + " = " + sum);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rowWiseSum(matrix);
    }
}

