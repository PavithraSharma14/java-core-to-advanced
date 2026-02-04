/*
 * Problem: Toggle Case
 *
 * Convert uppercase letters to lowercase
 * and lowercase letters to uppercase.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ToggleCase {

    public static void main(String[] args) {

        String str = "JaVaProGrAm";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            }
        }

        System.out.println(sb.toString());
    }
}

