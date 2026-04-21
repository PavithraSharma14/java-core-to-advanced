// Understanding call stack behavior

public class RecursionBasicsPart2 {

    public static void demo(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Before call: " + n);

        demo(n - 1);

        System.out.println("After call: " + n);
    }

    public static void main(String[] args) {
        demo(3);
    }
}
