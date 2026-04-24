// Find last occurrence of key in array

public class LastOccurrence {

    public static int lastOcc(int[] arr, int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOcc(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 5};
        System.out.println(lastOcc(arr, 4, 0));
    }
}