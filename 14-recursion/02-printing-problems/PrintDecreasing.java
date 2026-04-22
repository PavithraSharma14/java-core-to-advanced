// Print numbers from n to 1 using recursion

public class PrintDecreasing {

    public static void printDecreasing(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        // Recursive call
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        printDecreasing(5);
    }
}