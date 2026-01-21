/*
 * Introduction to 2D Arrays
 *
 * A 2D array stores data in the form of rows and columns.
 * It can be visualized as a table or matrix.
 *
 * Syntax:
 * dataType[][] arrayName = new dataType[rows][columns];
 */

public class Introduction {

    public static void main(String[] args) {

        // Declaration and initialization of a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements using row and column indices
        // matrix[row][column]
        int element = matrix[1][2]; // element at 2nd row, 3rd column

        System.out.println("Element at row 1, column 2: " + element);

        // Total number of rows
        System.out.println("Number of rows: " + matrix.length);

        // Total number of columns in the first row
        System.out.println("Number of columns: " + matrix[0].length);
    }
}

