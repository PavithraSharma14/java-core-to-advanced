// Q2: Read a set of integers and print sum of even and odd numbers
// Here we hardcode sample input. Later you can use Scanner.

public class Q2_SumEvenOddIntegers {

    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 9, 12, 7};
        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of Even Numbers = " + evenSum);
        System.out.println("Sum of Odd Numbers = " + oddSum);
    }
}

