// Demonstrates: Function Overloading
// Same method name — different parameter list.

class FunctionOverloadingDemo {

    // Overloading by number of parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading by datatype
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(2, 3));          // int version
        System.out.println(sum(2, 3, 4));       // 3-param version
        System.out.println(sum(2.5, 3.5));      // double version
    }
}
