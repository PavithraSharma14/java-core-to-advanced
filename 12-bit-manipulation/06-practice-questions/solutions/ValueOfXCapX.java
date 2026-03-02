/**
 * Problem: Find value of x & x
 * Concept: Bitwise AND
 *
 * Explanation:
 * Any number ANDed with itself gives the same number.
 *
 * Time Complexity: O(1)
 */

public class ValueOfXCapX {

    public static void main(String[] args) {

        int x = 10;

        int result = x & x;

        System.out.println("x & x = " + result);
    }
}
