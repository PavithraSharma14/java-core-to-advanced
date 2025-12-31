// Prints a 4x4 square pattern of stars
public class SquarePattern {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= n; j++) {    // columns
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }
}

