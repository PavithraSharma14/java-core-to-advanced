// Demonstrates: method syntax, parameters vs arguments,
// product of two numbers, factorial and binomial coefficient.

import java.util.*;

class MethodBasics {

    //Simple method with parameters
    static int product(int a, int b) {
        return a * b;   // returns product
    }

    //Factorial: n! = n * (n-1) * ... * 1
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    //Binomial Coefficient: nCr = n! / (r! * (n-r)!)
    static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);

        return nFact / (rFact * nrFact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product = " + product(a, b));

        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + factorial(n));

        System.out.print("Enter n and r for nCr: ");
        int nn = sc.nextInt();
        int rr = sc.nextInt();

        System.out.println("nCr = " + binomialCoefficient(nn, rr));

        sc.close();
    }
}

