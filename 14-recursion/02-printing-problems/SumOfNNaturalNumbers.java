// Find sum of first n natural numbers using recursion

public class SumOfNNaturalNumbers {

    public static int sum(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
