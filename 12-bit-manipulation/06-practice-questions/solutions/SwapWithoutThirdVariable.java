/**
 * Problem: Swap two numbers without using third variable
 * Concept: XOR property
 *
 * a = a ^ b
 * b = a ^ b
 * a = a ^ b
 */

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
