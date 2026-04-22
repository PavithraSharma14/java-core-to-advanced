// Calculate factorial of n using recursion

public class Factorial {

    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}