// Print numbers in increasing then decreasing order

public class PrintIncreasingDecreasing {

    public static void printIncDec(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Pre-order work
        System.out.print(n + " ");

        // Recursive call
        printIncDec(n - 1);

        // Post-order work
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncDec(3);
    }
}