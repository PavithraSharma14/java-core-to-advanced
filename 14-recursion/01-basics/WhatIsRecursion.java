// Understanding recursion with a simple example

public class WhatIsRecursion {

    public static void printHello(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.println("Hello " + n);

        // Recursive call
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}