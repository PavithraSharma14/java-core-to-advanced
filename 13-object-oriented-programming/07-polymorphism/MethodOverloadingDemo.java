/**
 * Method Overloading Example
 * Same method name, different parameter lists
 * Decided at compile-time
 */
class CalculatorOverLoading {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        CalculatorOverLoading calc = new CalculatorOverLoading();

        // Calling different versions of add()
        System.out.println(calc.add(2, 3));        // 2 int
        System.out.println(calc.add(2, 3, 4));     // 3 int
        System.out.println(calc.add(2.5, 3.5));    // double
    }
}