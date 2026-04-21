// Basic structure of recursion

public class RecursionBasicsPart1 {

    public static void countDown(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.println(n);

        // Recursive call
        countDown(n - 1);
    }

    public static void main(String[] args) {
        countDown(5);
    }
}
