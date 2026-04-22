// Calculate x^n using simple recursion

public class PowerOfN {

    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
