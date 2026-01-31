/*
 * Topic: What are Strings in Java
 *
 * A String is a sequence of characters.
 * In Java, String is a class and objects of String are immutable.
 */

public class WhatAreStrings {

    public static void main(String[] args) {

        // Creating strings using string literals
        String str1 = "Hello";
        String str2 = "World";

        // Creating string using 'new' keyword
        String str3 = new String("Java");

        // Printing strings
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        /*
         * Note:
         * - String literals are stored in the String Constant Pool
         * - Strings created using 'new' are stored in heap memory
         */
    }
}
