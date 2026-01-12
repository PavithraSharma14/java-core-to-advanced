public class PassArrayAsArgument {

    // Method that modifies array
    public static void modifyArray(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        modifyArray(numbers);

        // Change is reflected in original array
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}

