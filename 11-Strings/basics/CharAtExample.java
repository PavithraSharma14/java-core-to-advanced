/*
 * Topic: charAt() in Java
 *
 * charAt(index) is used to access a character
 * at a specific position in a string.
 * Indexing starts from 0.
 */

import java.util.Scanner;

public class CharAtExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        // Check index validity
        if (index >= 0 && index < word.length()) {
            char ch = word.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}
