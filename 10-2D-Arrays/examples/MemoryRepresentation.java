/*
 * Memory Representation of 2D Arrays
 *
 * In Java, a 2D array is stored as an array of 1D arrays.
 * Each row is a separate array object in memory.
 *
 * Java follows row-major order for storing 2D arrays.
 */

public class MemoryRepresentation {

    public static void main(String[] args) {

        // Creating a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing memory references of rows
        System.out.println("Row 0 reference: " + matrix[0]);
        System.out.println("Row 1 reference: " + matrix[1]);
        System.out.println("Row 2 reference: " + matrix[2]);

        // Demonstrating jagged array
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[1];

        System.out.println("Jagged array created with different row sizes");

        // Printing lengths of each row
        for (int i = 0; i < jagged.length; i++) {
            System.out.println(
                "Row " + i + " length: " + jagged[i].length
            );
        }
    }
}
