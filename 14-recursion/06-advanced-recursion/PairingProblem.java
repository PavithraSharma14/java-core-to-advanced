// Friends pairing problem

public class PairingProblem {

    public static int friendsPairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int single = friendsPairing(n - 1);

        // Pair
        int pair = (n - 1) * friendsPairing(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
