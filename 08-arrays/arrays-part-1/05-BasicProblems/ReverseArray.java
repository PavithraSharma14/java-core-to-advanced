public class ReverseArray {

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        // Loop runs n/2 times
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        reverse(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

