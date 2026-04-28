/*
PROBLEM:
Find all indices of a given key in an array using recursion.

APPROACH:
Traverse array using index.
If match → print index.
Continue recursion till end.
*/

public class AllOccurrencesSolution {

    public static void printAll(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        printAll(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printAll(arr, 2, 0);
    }
}