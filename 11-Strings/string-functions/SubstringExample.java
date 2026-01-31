/*
 * Topic: substring() in Java
 *
 * substring(startIndex)
 * substring(startIndex, endIndex)
 *
 * startIndex → inclusive
 * endIndex   → exclusive
 */

public class SubstringExample {

    public static void main(String[] args) {

        String str = "JavaProgramming";

        // substring from index to end
        String sub1 = str.substring(4);
        System.out.println("Substring from index 4: " + sub1);

        // substring from startIndex to endIndex
        String sub2 = str.substring(0, 4);
        System.out.println("Substring from index 0 to 4: " + sub2);

        // printing all substrings (classic use case)
        System.out.println("\nAll substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}

