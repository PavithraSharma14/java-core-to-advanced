/**
 * Prints numbers from 1 to n using recursion
 */
public class PrintNumbers {

    static void print(int n) {

        // BASE CASE → stops recursion
        if (n == 0) return;

        // recursive call
        print(n - 1);

        // executes after returning
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(5);
    }
}