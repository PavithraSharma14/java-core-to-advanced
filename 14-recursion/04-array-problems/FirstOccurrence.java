// Find first occurrence of key in array

public class FirstOccurrence {

    public static int firstOcc(int[] arr, int key, int i) {
        // Base case
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 5};
        System.out.println(firstOcc(arr, 4, 0));
    }
}
