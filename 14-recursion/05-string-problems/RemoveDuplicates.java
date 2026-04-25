// Remove duplicate characters from a string using recursion

public class RemoveDuplicates {

    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] map) {
        // Base case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);

        // Check if character already appeared
        if (map[currChar - 'a']) {
            // Skip duplicate
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            // Mark as seen and add to result
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}