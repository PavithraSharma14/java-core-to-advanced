/*
 * Creation and Representation of 2D Arrays
 *
 * A 2D array in Java is an array of arrays.
 * Each row can have the same or different number of columns.
 */

public class CreationAndRepresentation {

    public static void main(String[] args) {

        // Declaration
        int[][] arr;

        // Initialization with fixed rows and columns
        arr = new int[3][4]; // 3 rows, 4 columns

        // Assigning values
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[2][3] = 4;

        // Printing dimensions
        System.out.println("Rows: " + arr.length);
        System.out.println("Columns in row 0: " + arr[0].length);

        // Declaration + Initialization (most common)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the matrix using nested loops
        for (int i = 0; i < matrix.length; i++) {           // rows
            for (int j = 0; j < matrix[i].length; j++) {    // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array (rows with different column sizes)
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        System.out.println("Jagged array created successfully");
    }
}
