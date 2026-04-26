// Number of ways to tile a 2 x n board using 2 x 1 tiles

public class TilingProblem {

    public static int countWays(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical placement
        int vertical = countWays(n - 1);

        // Horizontal placement
        int horizontal = countWays(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }
}