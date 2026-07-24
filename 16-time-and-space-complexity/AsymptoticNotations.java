/**
 * ==========================================================
 * Topic 2/15 : Asymptotic Notations (Big O, Big Ω & Big Θ)
 * ==========================================================
 *
 * Asymptotic Notations describe how an algorithm grows
 * as the input size (n) becomes very large.
 *
 * They help compare algorithms without depending on
 * hardware, programming language, or execution time.
 */

public class AsymptoticNotations {

    public static void main(String[] args) {

        explainBigO();

        explainBigOmega();

        explainBigTheta();
    }

    /**
     * Big O Notation
     */
    public static void explainBigO() {

        System.out.println("========== Big O ==========");

        System.out.println("Definition : Upper Bound");

        System.out.println("Represents the maximum growth rate of an algorithm.");

        System.out.println();

        System.out.println("Example:");

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Loop executes n times");

        System.out.println("Time Complexity = O(n)");
    }

    /**
     * Big Omega Notation
     */
    public static void explainBigOmega() {

        System.out.println("\n========== Big Ω ==========");

        System.out.println("Definition : Lower Bound");

        System.out.println("Represents the minimum growth rate of an algorithm.");

        System.out.println();

        System.out.println("Example:");

        System.out.println("Linear Search");

        System.out.println("Searching first element");

        System.out.println("Minimum operations = 1");

        System.out.println("Complexity = Ω(1)");
    }

    /**
     * Big Theta Notation
     */
    public static void explainBigTheta() {

        System.out.println("\n========== Big Θ ==========");

        System.out.println("Definition : Tight Bound");

        System.out.println("Represents both upper and lower bounds.");

        System.out.println();

        System.out.println("Example:");

        int n = 5;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        System.out.println("Loop always executes n times");

        System.out.println("Complexity = Θ(n)");
    }
}

/*
==========================================================

Big O (O)

Represents the upper bound of an algorithm.

It guarantees that the algorithm will not
grow faster than the given complexity.

Examples

Linear Search

Worst Case

O(n)

Merge Sort

O(n log n)

Binary Search

O(log n)

----------------------------------------------------------

Big Omega (Ω)

Represents the lower bound.

Shows the minimum amount of work required.

Example

Linear Search

Target is first element

Ω(1)

----------------------------------------------------------

Big Theta (Θ)

Represents the tight bound.

The algorithm grows exactly at that rate.

Example

Printing every element of an array

Θ(n)

because

Best Case = n

Worst Case = n

Average Case = n

----------------------------------------------------------

Comparison

Big O

Upper Bound

Think

"At most"

----------------------------------------------------------

Big Ω

Lower Bound

Think

"At least"

----------------------------------------------------------

Big Θ

Exact Bound

Think

"Exactly"

----------------------------------------------------------

Interview Tip

❌ Wrong

Big O means Worst Case.

✅ Correct

Big O represents an upper bound.

Although it is commonly used to describe
Worst Case Time Complexity,
it is not limited to Worst Case only.

==========================================================
*/
