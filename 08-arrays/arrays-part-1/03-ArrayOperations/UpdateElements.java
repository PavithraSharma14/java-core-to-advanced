public class UpdateElements {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        // Updating element at index 1
        arr[1] = 99;

        // Printing updated array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
