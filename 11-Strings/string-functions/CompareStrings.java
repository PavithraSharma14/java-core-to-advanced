/*
 * Topic: Comparing Strings in Java
 *
 * ==       → compares memory location (reference)
 * equals() → compares actual string content
 */

public class CompareStrings {

    public static void main(String[] args) {

        // Case 1: String literals
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("Using == : " + (s1 == s2));        // true
        System.out.println("Using equals(): " + s1.equals(s2)); // true

        System.out.println();

        // Case 2: Strings created using new keyword
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("Using == : " + (s3 == s4));        // false
        System.out.println("Using equals(): " + s3.equals(s4)); // true
    }
}

