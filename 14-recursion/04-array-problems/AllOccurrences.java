// Print all occurrences of a key

public class AllOccurrences {

    public static void printAll(int[] arr, int key, int i) {
        // Base case
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        printAll(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 5, 4};
        printAll(arr, 4, 0);
    }
}