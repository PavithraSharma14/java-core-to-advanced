/**
 * Problem: Convert uppercase to lowercase using bit manipulation
 * Concept: ASCII bit trick
 *
 * OR with ' ' (space) sets 6th bit
 */

public class UpperToLowerUsingBits {

    public static void main(String[] args) {

        char ch = 'A';

        char lower = (char)(ch | ' ');

        System.out.println("Lowercase: " + lower);
    }
}
