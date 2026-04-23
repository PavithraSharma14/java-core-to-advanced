// Print Fibonacci series using recursion

public class Fibonacci {

    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");

        printFibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("0 1 ");
        printFibonacci(0, 1, n - 2);
    }
}