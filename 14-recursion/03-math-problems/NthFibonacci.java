// Find nth Fibonacci number using recursion
// This is intentionally inefficient (O(2^n))

public class NthFibonacci {

    public static int fib(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}