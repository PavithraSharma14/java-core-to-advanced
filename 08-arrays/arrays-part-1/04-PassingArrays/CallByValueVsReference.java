public class CallByValueVsReference {

    public static void changeValue(int x) {
        x = 50;
    }

    public static void changeArray(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        int a = 10;
        int[] data = {1, 2, 3};

        changeValue(a);
        changeArray(data);

        System.out.println("Value of a: " + a);      // 10
        System.out.println("First element: " + data[0]); // 99
    }
}

