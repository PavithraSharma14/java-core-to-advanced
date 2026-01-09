public class Q7_FunctionOverloading {
    // Same function name, different parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));        // int version
        System.out.println(sum(2.5, 3.5));    // double version
    }
}
