// Program: Check whether a number is even or odd using ternary operator
public class TernaryOperator_IfElseExample {
    public static void main(String[] args) {

        int num = 10;  // example number

        // condition ? value_if_true : value_if_false
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
}

