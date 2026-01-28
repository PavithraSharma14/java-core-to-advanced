/*
 * Practice Question: Transpose of a Matrix
 *
 * Time Complexity: O(rows × cols)
 * Space Complexity: O(cols × rows)
 */

public class TransposeMatrix {

    public static void transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transposed matrix will have swapped dimensions
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Printing the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        transpose(matrix);
    }
}
