public class Q4_PrimeCheck {

    // Returns true if number is prime
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }

        // Check till square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // divisible → not prime
            }
        }

        return true; // prime number
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));   // true
        System.out.println(isPrime(10));  // false
    }
}

