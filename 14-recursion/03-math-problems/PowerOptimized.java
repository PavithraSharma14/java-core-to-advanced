// Optimized power calculation using divide and conquer

public class PowerOptimized {

    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        int halfPower = power(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // If n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}