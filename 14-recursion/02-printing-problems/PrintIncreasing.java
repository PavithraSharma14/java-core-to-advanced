// Print numbers from 1 to n using recursion

public class PrintIncreasing {

    public static void printIncreasing(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printIncreasing(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncreasing(5);
    }
}
