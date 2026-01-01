// Q3: Program to find factorial of a number
// Example: n = 5 → 5! = 120

public class Q3_FactorialOfNumber {

    public static void main(String[] args) {

        int n = 5;          // you can replace with user input
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;      // fact = fact * i
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
