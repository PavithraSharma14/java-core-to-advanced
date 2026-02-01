/*
 * Problem: String Compression
 *
 * Compress a string by counting consecutive
 * repeated characters.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class StringCompression {

    public static String compress(String str) {

        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            // check if next character is same
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1; // reset count
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbcccdd";
        System.out.println("Compressed String: " + compress(str));
    }
}

