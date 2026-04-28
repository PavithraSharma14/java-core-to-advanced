/*
PROBLEM:
Find length of string using recursion.

APPROACH:
Remove one character each time and count.
*/

public class StringLengthSolution {

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(length("hello"));
    }
}