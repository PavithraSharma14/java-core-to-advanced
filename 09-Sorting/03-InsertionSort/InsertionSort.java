public class InsertionSort {

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements of the sorted part to make space
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current element at its correct position
            arr[j + 1] = current;
        }
    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 4};

        insertionSort(arr);
        printArray(arr);
    }
}

