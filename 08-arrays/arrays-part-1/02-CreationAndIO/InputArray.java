import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Creating array with given size
        int[] arr = new int[size];

        // Taking input elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Input completed successfully");
        sc.close();
    }
}

