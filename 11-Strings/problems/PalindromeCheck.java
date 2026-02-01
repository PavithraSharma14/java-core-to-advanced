/*
 * Problem: Palindrome Check
 *
 * A string is a palindrome if it reads the same
 * forward and backward.
 *
 * Example:
 * "madam" → palindrome
 * "java"  → not palindrome
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
