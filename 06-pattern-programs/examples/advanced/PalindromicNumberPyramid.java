// Prints a palindromic number pyramid
public class PalindromicNumberPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

