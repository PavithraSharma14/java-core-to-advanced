// Demonstrates what happens without a base case

public class StackOverflowDemo {

    public static void infiniteCall(int n) {
        System.out.println("Calling: " + n);

        // No base case → causes StackOverflowError
        infiniteCall(n + 1);
    }

    public static void main(String[] args) {
        // Uncomment to see stack overflow error
        // infiniteCall(1);
    }
}
