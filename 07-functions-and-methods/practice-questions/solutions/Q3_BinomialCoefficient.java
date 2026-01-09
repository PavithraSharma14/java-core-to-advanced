// Q3: Program to calculate Binomial Coefficient (nCr)
// Formula: nCr = n! / (r! * (n - r)!)

public class Q3_BinomialCoefficient {

    // Method to calculate factorial of a number
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Method to calculate nCr
    static int binomialCoefficient(int n, int r) {

        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);

        return nFact / (rFact * nrFact);
    }

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        System.out.println("Binomial Coefficient (nCr) = "
                + binomialCoefficient(n, r));
    }
}


