// Prints a hollow rectangle pattern
public class HollowRectangle {
    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // Print star only at boundary positions
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // inner space
                }
            }
            System.out.println();
        }
    }
}

