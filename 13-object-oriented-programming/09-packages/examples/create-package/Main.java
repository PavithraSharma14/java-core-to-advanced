import util.Calculator;

/*
 * Main class using Calculator from util package
 */
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result = calc.add(10, 20);

        System.out.println("Sum = " + result);
    }
}
