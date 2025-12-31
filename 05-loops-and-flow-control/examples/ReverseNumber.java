// Reverses a number like 1234 -> 4321
public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;           // get last digit
            reversed = reversed * 10 + digit;
            num /= 10;                      // remove last digit
        }

        System.out.println("Reversed number = " + reversed);
    }
}

