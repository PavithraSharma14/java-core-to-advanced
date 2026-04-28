/*
PROBLEM:
Count substrings that start and end with same character.

APPROACH:
Use recursion with shrinking window.
Compare first and last characters.
*/

public class CountSubstrings {

    public static int count(String str, int i, int j) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            return 1;
        }

        int res = count(str, i + 1, j)
                + count(str, i, j - 1)
                - count(str, i + 1, j - 1);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "aba";
        System.out.println(count(str, 0, str.length() - 1));
    }
}
