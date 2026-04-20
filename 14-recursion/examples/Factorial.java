/**
 * Factorial using recursion
 * n! = n * (n-1)!
 */
public class Factorial {

    static int fact(int n) {

        // base case
        if (n == 0 || n == 1)
            return 1;

        // recursive case
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
