/**
 * Problem: Add 1 to an integer using bit manipulation
 * Concept: Two's complement
 */

public class AddOneUsingBits {

    public static int addOne(int x) {
        return - (~x);
    }

    public static void main(String[] args) {

        int x = 7;

        System.out.println("x + 1 = " + addOne(x));
    }
}