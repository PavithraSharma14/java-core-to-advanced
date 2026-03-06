/**
 * Example: Methods Inside a Class
 *
 * Classes contain methods that define behavior.
 * Methods operate on the data of the object.
 */

class Calculator {

    // Method that adds two numbers
    int add(int a, int b) {
        return a + b;
    }
}

public class MethodInsideClassExample {

    public static void main(String[] args) {

        // Creating Calculator object
        Calculator calc = new Calculator();

        // Calling method using object
        int result = calc.add(5, 7);

        System.out.println("Sum: " + result);
    }
}