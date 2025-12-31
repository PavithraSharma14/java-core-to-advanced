// Calculates sum = 1 + 2 + ... + n
public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;   // add i to sum
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}

