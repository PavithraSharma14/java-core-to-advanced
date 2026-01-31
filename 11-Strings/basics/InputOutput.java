/*
 * Topic: Input and Output with Strings
 *
 * Demonstrates how to take string input
 * and display output in Java.
 */

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Displaying output
        System.out.println("Hello, " + name);

        sc.close();
    }
}

