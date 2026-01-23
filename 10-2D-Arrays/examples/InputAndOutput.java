import java.util.Scanner;

/*
 * Input and Output in 2D Arrays
 *
 * Input and output operations are performed using nested loops.
 * Outer loop handles rows and inner loop handles columns.
 */

public class InputAndOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {            // rows
            for (int j = 0; j < cols; j++) {        // columns
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output elements
        System.out.println("Matrix elements are:");
        for (int i = 0; i < rows; i++) {            // rows
            for (int j = 0; j < cols; j++) {        // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

