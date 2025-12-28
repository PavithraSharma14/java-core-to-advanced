import java.util.Scanner;
/*
 * Variables in Java:
 * A variable is a container that stores a value in memory.
 * You must declare the type and then give it a name.
 * Example: int age = 20;
 */

class VariablesDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- Example 1: Sum of two numbers ----
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;   // storing the result in a variable
        System.out.println("Sum = " + sum);

        // ---- Example 2: Product of two numbers ----
        int product = a * b;
        System.out.println("Product = " + product);

        // ---- Example 3: Area of a circle ----
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r; // area stored in variable
        System.out.println("Area = " + area);

        sc.close();
    }
}

