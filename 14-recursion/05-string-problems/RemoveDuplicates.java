/*
PROBLEM:
Given a string, remove duplicate characters while preserving the order
of their first occurrence.

Example:
Input: "appnnacollege"
Output: "apncoleg"

Explanation:
- 'a' appears once → keep
- 'p' appears multiple times → keep first, remove others
- same for all characters

--------------------------------------------------

APPROACH:

We process the string character by character using recursion.

At each step:
1. Take the current character
2. Check if it has already been seen
   - If YES → skip it
   - If NO → add it to result and mark it as visited

To efficiently track visited characters:
- Use a boolean array of size 26 (for lowercase letters)
- Index mapping: char - 'a'

We use:
- index → to traverse the string
- StringBuilder → to build result efficiently (mutable)
- boolean[] map → to track duplicates

--------------------------------------------------

RECURSION LOGIC:

- Base Case:
  If index == string length → print result

- Work:
  Check current character:
    → If already visited → skip
    → Else → add to result and mark visited

- Recursive Call:
  Move to next index

--------------------------------------------------

TIME COMPLEXITY:
- O(n)

SPACE COMPLEXITY:
- O(n) (recursion stack + result)

--------------------------------------------------

INSIGHT:
- This is forward recursion
- Work is done while going down the stack
- No heavy computation during backtracking
*/

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